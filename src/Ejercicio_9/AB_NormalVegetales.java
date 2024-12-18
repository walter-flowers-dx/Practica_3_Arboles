package Ejercicio_9;

import java.util.Scanner;

public class AB_NormalVegetales extends ArbolBinarioVegetales {
    public void crear(NodoVegetales R) {
        Scanner lee = new Scanner(System.in);
        if (R != null) {
            System.out.println("Introduce datos del vegetal:");
            System.out.print("Nombre del vegetal: ");
            String nombre = lee.nextLine();
            System.out.print("Tipo de vegetal: ");
            String tipo = lee.nextLine();
            System.out.print("Producción mensual: ");
            double produccion = lee.nextDouble();
            System.out.print("Hectáreas: ");
            double hectareas = lee.nextDouble();
            lee.nextLine(); // Limpiar el buffer

            R.setVegetales(new Vegetales(nombre, tipo, produccion, hectareas));

            System.out.print("¿El nodo " + nombre + " tendrá hijo izquierdo? (s/n): ");
            String resp = lee.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                NodoVegetales nuevoIzq = new NodoVegetales();
                R.setIzq(nuevoIzq);
                crear(R.getIzq());
            }

            System.out.print("¿El nodo " + nombre + " tendrá hijo derecho? (s/n): ");
            resp = lee.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                NodoVegetales nuevoDer = new NodoVegetales();
                R.setDer(nuevoDer);
                crear(R.getDer());
            }
        }
    }

    public void crearPorDefecto() {
        raiz = new NodoVegetales(new Vegetales("Tomate", "Fruto", 1000, 5));
        raiz.setIzq(new NodoVegetales(new Vegetales("Lechuga", "Hoja", 500, 2)));
        raiz.setDer(new NodoVegetales(new Vegetales("Zanahoria", "Raíz", 800, 3)));
        raiz.getIzq().setIzq(new NodoVegetales(new Vegetales("Espinaca", "Hoja", 300, 1)));
        raiz.getIzq().setDer(new NodoVegetales(new Vegetales("Apio", "Tallo", 400, 1.5)));
        raiz.getDer().setDer(new NodoVegetales(new Vegetales("Papa", "Raíz", 1500, 4)));
    }

    public void preOrden(NodoVegetales R) {
        if (R != null) {
            R.getVegetales().mostrar();
            preOrden(R.getIzq());
            preOrden(R.getDer());
        }
    }

    public void inOrden(NodoVegetales R) {
        if (R != null) {
            inOrden(R.getIzq());
            R.getVegetales().mostrar();
            inOrden(R.getDer());
        }
    }

    public void postOrden(NodoVegetales R) {
        if (R != null) {
            postOrden(R.getIzq());
            postOrden(R.getDer());
            R.getVegetales().mostrar();
        }
    }

    public void hojas(NodoVegetales R) {
        if (R != null) {
            if (R.getIzq() == null && R.getDer() == null) {
                R.getVegetales().mostrar();
            }
            hojas(R.getIzq());
            hojas(R.getDer());
        }
    }
}
