package Ejercicio_1;

public class Principal {

	public static void main(String[] args) {
		AB_NormalLetrasMayusculas z = new AB_NormalLetrasMayusculas();
		NodoLetrasMayusculas r = new NodoLetrasMayusculas();
		z.setRaiz(r);
		z.crear(z.getRaiz());
		
		System.out.println("a) Mostrar en InOrden: ");
		z.inOrden(z.getRaiz());
		
		System.out.println("\n\nb) Mostrar en PreOrden");
		z.preOrden(z.getRaiz());
		
		System.out.println("\n\nc) Mostrar en PostOrden");
		z.postOrden(z.getRaiz());
		
		System.out.println("\n\nd) Contar la cantidad de Hojas");
		System.out.println(z.nroHojas(z.getRaiz()));
	}

}
