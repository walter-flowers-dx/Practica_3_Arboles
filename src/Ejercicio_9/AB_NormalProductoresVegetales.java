package Ejercicio_9;

import java.util.Scanner;

public class AB_NormalProductoresVegetales extends ArbolBinarioProductoresVegetales {
    public void crear(NodoProductoresVegetales R) {
        Scanner lee = new Scanner(System.in);
        if (R != null) {
            System.out.println("Introduce datos del productor:");
            System.out.print("ID del productor: ");
            int id = lee.nextInt();
            lee.nextLine(); // Limpiar el buffer
            System.out.print("Nombre del productor: ");
            String nombre = lee.nextLine();
            System.out.print("Localidad del productor: ");
            String localidad = lee.nextLine();

            R.setProVe(new ProductoresVegetales(id, nombre, localidad, new AB_NormalVegetales()));

            System.out.print("¿El nodo " + nombre + " tendrá hijo izquierdo? (s/n): ");
            String resp = lee.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                NodoProductoresVegetales nuevoIzq = new NodoProductoresVegetales();
                R.setIzq(nuevoIzq);
                crear(R.getIzq());
            }

            System.out.print("¿El nodo " + nombre + " tendrá hijo derecho? (s/n): ");
            resp = lee.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                NodoProductoresVegetales nuevoDer = new NodoProductoresVegetales();
                R.setDer(nuevoDer);
                crear(R.getDer());
            }
        }
    }

    public void crearPorDefecto() {
        raiz = new NodoProductoresVegetales(new ProductoresVegetales(1, "Juan", "Santa Cruz", new AB_NormalVegetales()));
        raiz.setIzq(new NodoProductoresVegetales(new ProductoresVegetales(2, "Pedro", "Cochabamba", new AB_NormalVegetales())));
        raiz.setDer(new NodoProductoresVegetales(new ProductoresVegetales(3, "María", "La Paz", new AB_NormalVegetales())));
        raiz.getIzq().setIzq(new NodoProductoresVegetales(new ProductoresVegetales(4, "Marco", "Sucre", new AB_NormalVegetales())));
        raiz.getIzq().setDer(new NodoProductoresVegetales(new ProductoresVegetales(5, "Dario", "Potosí", new AB_NormalVegetales())));
        raiz.getDer().setDer(new NodoProductoresVegetales(new ProductoresVegetales(6, "Alex", "Oruro", new AB_NormalVegetales())));
    }

    public void preOrden(NodoProductoresVegetales R) {
        if (R != null) {
            R.getProVe().mostrar();
            preOrden(R.getIzq());
            preOrden(R.getDer());
        }
    }

    public void inOrden(NodoProductoresVegetales R) {
        if (R != null) {
            inOrden(R.getIzq());
            R.getProVe().mostrar();
            inOrden(R.getDer());
        }
    }

    public void postOrden(NodoProductoresVegetales R) {
        if (R != null) {
            postOrden(R.getIzq());
            postOrden(R.getDer());
            R.getProVe().mostrar();
        }
    }

    public void hojas(NodoProductoresVegetales R) {
        if (R != null) {
            if (R.getIzq() == null && R.getDer() == null) {
                R.getProVe().mostrar();
            }
            hojas(R.getIzq());
            hojas(R.getDer());
        }
    }
}
