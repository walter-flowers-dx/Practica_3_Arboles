package Ejercicio_7;

import java.util.Scanner;

// Lic. Marcelo Aruquipa
public class AB_NormalLetrasMayusculas extends ArbolBinarioLetrasMayusculas {

    public void crear(NodoLetrasMayusculas R) {
        Scanner lee = new Scanner(System.in);
        if (R != null) {
            System.out.println("Intr. Datos: caracter (letra mayúscula)");
            char letra = lee.next().charAt(0);
            R.setLetra(letra);

            // Hijo izquierdo
            System.out.println("¿El nodo " + letra + " tendrá hijo izquierdo? (s/n)");
            String resp = lee.next();
            if (resp.equalsIgnoreCase("s")) {
                NodoLetrasMayusculas nuevoIzq = new NodoLetrasMayusculas();
                R.setIzq(nuevoIzq);
                crear(R.getIzq());
            }

            // Hijo central
            System.out.println("¿El nodo " + letra + " tendrá hijo central? (s/n)");
            resp = lee.next();
            if (resp.equalsIgnoreCase("s")) {
                NodoLetrasMayusculas nuevoCentro = new NodoLetrasMayusculas();
                R.setCentro(nuevoCentro);
                crear(R.getCentro());
            }

            // Hijo derecho
            System.out.println("¿El nodo " + letra + " tendrá hijo derecho? (s/n)");
            resp = lee.next();
            if (resp.equalsIgnoreCase("s")) {
                NodoLetrasMayusculas nuevoDer = new NodoLetrasMayusculas();
                R.setDer(nuevoDer);
                crear(R.getDer());
            }
        }
    }

    // Recorrido en preorden
    public void preOrden(NodoLetrasMayusculas R) {
        if (R != null) {
            System.out.print(R.getLetra() + " ");
            preOrden(R.getIzq());
            preOrden(R.getCentro());
            preOrden(R.getDer());
        }
    }

    // Recorrido en inorden
    public void inOrden(NodoLetrasMayusculas R) {
        if (R != null) {
            inOrden(R.getIzq());
            System.out.print(R.getLetra() + " ");
            inOrden(R.getCentro());
            inOrden(R.getDer());
        }
    }

    // Recorrido en postorden
    public void postOrden(NodoLetrasMayusculas R) {
        if (R != null) {
            postOrden(R.getIzq());
            postOrden(R.getCentro());
            postOrden(R.getDer());
            System.out.print(R.getLetra() + " ");
        }
    }
}
