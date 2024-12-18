package Ejercicio_5;

import java.util.Scanner;

// Lic. Marcelo Aruquipa
public class AB_NormalMascota extends ArbolBinarioMascota {

    public void crear(NodoMascota R) {
        Scanner lee = new Scanner(System.in);
        if (R != null) {
            System.out.println("Intr. Datos: ");
            Mascota m = new Mascota(0,"","","",0,0);

            System.out.println("¿El nodo " + m.getNombreMascota() + " tendrá hijo izquierdo? (s/n)");
            String resp = lee.next();
            if (resp.equalsIgnoreCase("s")) {
                NodoMascota nuevoIzq = new NodoMascota();
                R.setIzq(nuevoIzq);
                crear(R.getIzq());
            }

            System.out.println("¿El nodo " + m.getNombreMascota() + " tendrá hijo derecho? (s/n)");
            resp = lee.next();
            if (resp.equalsIgnoreCase("s")) {
                NodoMascota nuevoDer = new NodoMascota();
                R.setDer(nuevoDer);
                crear(R.getDer());
            }
        }
    }
    
    public void crearPorDefecto() {
		this.getRaiz().setMascota(new Mascota(1, "Perro", "Bubu", "Macho", 2, 1));
		this.getRaiz().setIzq(new NodoMascota(new Mascota(2, "Gato", "Jack", "Macho", 3, 1)));
		this.getRaiz().setDer(new NodoMascota(new Mascota(3, "Loro", "Felix", "Macho", 2 ,3)));
		this.getRaiz().getIzq().setIzq(new NodoMascota(new Mascota(4, "Perro", "Luna", "Hembra", 2, 1)));
		this.getRaiz().getIzq().setDer(new NodoMascota(new Mascota(5, "Gato", "Lola", "Hembra", 1, 3)));
		this.getRaiz().getDer().setDer(new NodoMascota(new Mascota(6, "Mono", "Max", "Macho", 2, 4)));		
	}

    // Recorrido en preorden
    public void preOrden(NodoMascota R) {
        if (R != null) {
            R.getMascota().mostrar();
            preOrden(R.getIzq());
            preOrden(R.getDer());
        }
    }

    // Recorrido en inorden
    public void inOrden(NodoMascota R) {
        if (R != null) {
            inOrden(R.getIzq());
            R.getMascota().mostrar();
            inOrden(R.getDer());
        }
    }

    // Recorrido en postorden
    public void postOrden(NodoMascota R) {
        if (R != null) {
            postOrden(R.getIzq());
            postOrden(R.getDer());
            R.getMascota().mostrar();
        }
    }

    // Mostrar las hojas del árbol
    public void hojas(NodoMascota R) {
        if (R != null) {
            if (R.getIzq() == null && R.getDer() == null) {
            	R.getMascota().mostrar();
            }
            hojas(R.getIzq());
            hojas(R.getDer());
        }
    }
}
