package Ejercicio_1;

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

    // Contar el número de hojas en el árbol
    public int nroHojas(NodoLetrasMayusculas R) {
        if (R != null) {
            int c = nroHojas(R.getIzq()) + nroHojas(R.getDer());
            if (R.getIzq() == null && R.getDer() == null) {
                c++;
            }
            return c;
        } else {
            return 0;
        }
    }
    
    // Contar niveles del arbol
    public int contarNiveles(NodoLetrasMayusculas R) {
        if (R == null) {
            return 0;
        }
        int alturaIzq = contarNiveles(R.getIzq());
        int alturaDer = contarNiveles(R.getDer());
        return 1 + Math.max(alturaIzq, alturaDer);
    }
    
    // Podar el arbol a partir de un nivel
    public NodoLetrasMayusculas podarNivel(NodoLetrasMayusculas R, int nivelActual, int nivelLimite) {
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
    
    // Podar las hojas de un arbol
    public NodoLetrasMayusculas podarHojas(NodoLetrasMayusculas R) {
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
