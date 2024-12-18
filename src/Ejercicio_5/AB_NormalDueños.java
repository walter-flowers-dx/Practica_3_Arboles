package Ejercicio_5;

import java.util.Scanner;

public class AB_NormalDueños extends ArbolBinarioDueños{
	public void crear(NodoDueños R) {
        Scanner lee = new Scanner(System.in);
        if (R != null) {
            System.out.println("Intr. Datos: ");
            Dueños d = new Dueños(0,"",0);

            System.out.println("¿El nodo " + d.getNombreDueño() + " tendrá hijo izquierdo? (s/n)");
            String resp = lee.next();
            if (resp.equalsIgnoreCase("s")) {
                NodoDueños nuevoIzq = new NodoDueños();
                R.setIzq(nuevoIzq);
                crear(R.getIzq());
            }

            System.out.println("¿El nodo " + d.getNombreDueño() + " tendrá hijo derecho? (s/n)");
            resp = lee.next();
            if (resp.equalsIgnoreCase("s")) {
                NodoDueños nuevoDer = new NodoDueños();
                R.setDer(nuevoDer);
                crear(R.getDer());
            }
        }
    }
	
	public void crearPorDefecto() {
		this.getRaiz().setDueños(new Dueños(1, "Juan", 75293));
		this.getRaiz().setIzq(new NodoDueños(new Dueños(2, "Pedro", 67811)));
		this.getRaiz().setDer(new NodoDueños(new Dueños(3, "Maria", 75121)));
		this.getRaiz().getIzq().setIzq(new NodoDueños(new Dueños(4, "Marco", 66791)));
		this.getRaiz().getIzq().setDer(new NodoDueños(new Dueños(5, "Dario", 76666)));
		this.getRaiz().getDer().setDer(new NodoDueños(new Dueños(6, "Alex", 70012)));		
	}

    // Recorrido en preorden
    public void preOrden(NodoDueños R) {
        if (R != null) {
            R.getDueños().mostrar();
            preOrden(R.getIzq());
            preOrden(R.getDer());
        }
    }

    // Recorrido en inorden
    public void inOrden(NodoDueños R) {
        if (R != null) {
            inOrden(R.getIzq());
            R.getDueños().mostrar();
            inOrden(R.getDer());
        }
    }

    // Recorrido en postorden
    public void postOrden(NodoDueños R) {
        if (R != null) {
            postOrden(R.getIzq());
            postOrden(R.getDer());
            R.getDueños().mostrar();
        }
    }

    // Mostrar las hojas del árbol
    public void hojas(NodoDueños R) {
        if (R != null) {
            if (R.getIzq() == null && R.getDer() == null) {
            	R.getDueños().mostrar();
            }
            hojas(R.getIzq());
            hojas(R.getDer());
        }
    }
}
