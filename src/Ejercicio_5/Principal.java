package Ejercicio_5;

public class Principal {

	public static void main(String[] args) {
		// ARBOL DE MASCOTAS
		System.out.println("ARBOL DE MASCOTAS.- ");
		AB_NormalMascota abm = new AB_NormalMascota();
		NodoMascota nm = new NodoMascota();
		abm.setRaiz(nm);
		abm.crearPorDefecto();
		abm.preOrden(abm.getRaiz());
		
		// ARBOL DE DUEÑOS
		System.out.println("\nARBOL DE DUEÑOS");
		AB_NormalDueños abd = new AB_NormalDueños();
		NodoDueños nd = new NodoDueños();
		abd.setRaiz(nd);
		abd.crearPorDefecto();
		abd.preOrden(abd.getRaiz());
		
		System.out.println("\na) Mostrar la cantidad de mascotas de tipo X de el arbol de mascotas");
		String tipoMascotaX = "Perro"; 
		System.out.println("Cantidad de mascotas de tipo '" + tipoMascotaX + "': " + contarMascotasDeTipo(abm.getRaiz(), tipoMascotaX));
		
		System.out.println("\nb) Determinar el dueño con más mascotas");
		int idDueñoConMasMascotas = obtenerDueñoConMasMascotas(abm.getRaiz());
		System.out.println("ID del dueño con más mascotas: " + idDueñoConMasMascotas);
		
		System.out.println("\nc) Mostrar el nombre del dueño con nombre X, mostrar el nombre de sus mascotas de tipo Y");
		String nombreDueñoX = "Juan"; 
		String tipoMascotaY = "Gato"; 
		mostrarMascotasDeDueño(abm.getRaiz(), abd.getRaiz(), nombreDueñoX, tipoMascotaY);
	}

	// a.
	private static int contarMascotasDeTipo(NodoMascota R, String tipo) {
		if (R == null) return 0;
		int cont = R.getMascota().getTipoMascota().equalsIgnoreCase(tipo) ? 1 : 0;
		return cont + contarMascotasDeTipo(R.getIzq(), tipo) + contarMascotasDeTipo(R.getDer(), tipo);
	}

	// b.
	private static int obtenerDueñoConMasMascotas(NodoMascota R) {
		if (R == null) return -1; 
		return calcularMaxMascotas(R, new int[100]);
	}

	private static int calcularMaxMascotas(NodoMascota R, int[] contador) {
		if (R == null) return -1;
		contador[R.getMascota().getIdDueñoMascota()]++;
		calcularMaxMascotas(R.getIzq(), contador);
		calcularMaxMascotas(R.getDer(), contador);

		int maxId = 0, maxcont = 0;
		for (int i = 0; i < contador.length; i++) {
			if (contador[i] > maxcont) {
				maxcont = contador[i];
				maxId = i;
			}
		}
		return maxId;
	}

	// c.
	private static void mostrarMascotasDeDueño(NodoMascota mascotas, NodoDueños dueños, String nombreDueño, String tipoMascota) {
		int idDueño = buscarIdDueño(dueños, nombreDueño);
		if (idDueño == -1) {
			System.out.println("No se encontró al dueño con nombre: " + nombreDueño);
			return;
		}
		System.out.println("Mascotas de tipo '" + tipoMascota + "' del dueño " + nombreDueño + ":");
		mostrarMascotasDeTipoPorDueño(mascotas, idDueño, tipoMascota);
	}

	private static int buscarIdDueño(NodoDueños R, String nombreDueño) {
		if (R == null) return -1;
		if (R.getDueños().getNombreDueño().equalsIgnoreCase(nombreDueño)) return R.getDueños().getIdDueño();
		int izq = buscarIdDueño(R.getIzq(), nombreDueño);
		if (izq != -1) return izq;
		return buscarIdDueño(R.getDer(), nombreDueño);
	}

	private static void mostrarMascotasDeTipoPorDueño(NodoMascota R, int idDueño, String tipoMascota) {
		if (R == null) return;
		if (R.getMascota().getIdDueñoMascota() == idDueño && R.getMascota().getTipoMascota().equalsIgnoreCase(tipoMascota)) {
			System.out.println(R.getMascota().getNombreMascota());
		}
		mostrarMascotasDeTipoPorDueño(R.getIzq(), idDueño, tipoMascota);
		mostrarMascotasDeTipoPorDueño(R.getDer(), idDueño, tipoMascota);
	}
}
