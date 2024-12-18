package Ejercicio_3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		AB_NormalLetrasMayusculas z = new AB_NormalLetrasMayusculas();
		NodoLetrasMayusculas r = new NodoLetrasMayusculas();
		z.setRaiz(r);
		z.crear(z.getRaiz());
		
        System.out.println("a) Contar cuantos niveles tiene el Arbol:");
        System.out.println(contarNiveles(r));

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nb) Podar el Arbol a partir del nivel X:");
        System.out.print("Ingrese el nivel X para podar: ");
        int nivelX = scanner.nextInt();
        r = podarNivel(r, 0, nivelX);
        System.out.println("Árbol en InOrden después de podar:");
        z.inOrden(z.getRaiz());

        System.out.println("\nc) Podar las hojas del arbol:");
        r = podarHojas(r);
        System.out.println("Árbol en InOrden después de podar las hojas:");
        z.inOrden(z.getRaiz());
    }

    // a.
    public static int contarNiveles(NodoLetrasMayusculas R) {
        if (R == null) {
            return 0;
        }
        int alturaIzq = contarNiveles(R.getIzq());
        int alturaDer = contarNiveles(R.getDer());
        return 1 + Math.max(alturaIzq, alturaDer);
    }

    // b.
    public static NodoLetrasMayusculas podarNivel(NodoLetrasMayusculas R, int nivelActual, int nivelLimite) {
        if (R == null) {
            return null;
        }
        if (nivelActual >= nivelLimite) {
            return null;
        }
        R.setIzq(podarNivel(R.getIzq(), nivelActual + 1, nivelLimite));
        R.setDer(podarNivel(R.getDer(), nivelActual + 1, nivelLimite));
        return R;
    }

    // c.
    public static NodoLetrasMayusculas podarHojas(NodoLetrasMayusculas R) {
        if (R == null) {
            return null;
        }
        if (R.getIzq() == null && R.getDer() == null) {
            return null;
        }
        R.setIzq(podarHojas(R.getIzq()));
        R.setDer(podarHojas(R.getDer()));
        return R;
    }
}