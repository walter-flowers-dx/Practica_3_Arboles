package Ejercicio_3;

import java.util.Scanner;

// Lic. Marcelo Aruquipa
public class AB_NormalLetrasMayusculas extends ArbolBinarioLetrasMayusculas {

    public void crear(NodoLetrasMayusculas R) {
        Scanner lee = new Scanner(System.in);
        if (R != null) {
            System.out.println("Intr. Datos: caracter (letra mayúscula)");
            char letra = lee.next().charAt(0);
            R.setLetra(letra);

            System.out.println("¿El nodo " + letra + " tendrá hijo izquierdo? (s/n)");
            String resp = lee.next();
            if (resp.equalsIgnoreCase("s")) {
                NodoLetrasMayusculas nuevoIzq = new NodoLetrasMayusculas();
                R.setIzq(nuevoIzq);
                crear(R.getIzq());
            }

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
            preOrden(R.getDer());
        }
    }

    // Recorrido en inorden
    public void inOrden(NodoLetrasMayusculas R) {
        if (R != null) {
            inOrden(R.getIzq());
            System.out.print(R.getLetra() + " ");
            inOrden(R.getDer());
        }
    }

    // Recorrido en postorden
    public void postOrden(NodoLetrasMayusculas R) {
        if (R != null) {
            postOrden(R.getIzq());
            postOrden(R.getDer());
            System.out.print(R.getLetra() + " ");
        }
    }

    // Mostrar las hojas del árbol
    public void hojas(NodoLetrasMayusculas R) {
        if (R != null) {
            if (R.getIzq() == null && R.getDer() == null) {
                System.out.print(R.getLetra() + " ");
            }
            hojas(R.getIzq());
            hojas(R.getDer());
        }
    }

    

}
