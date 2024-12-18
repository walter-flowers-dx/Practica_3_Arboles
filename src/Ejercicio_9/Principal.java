package Ejercicio_9;

public class Principal {
	
    public static void main(String[] args) {
        AB_NormalProductoresVegetales arbolProductores = new AB_NormalProductoresVegetales();
        arbolProductores.crearPorDefecto();
        asignarVegetales(arbolProductores.getRaiz());

        System.out.println("\na) Mostrar el nombre de los productores que producen el vegetal del tipo 'Raíz':");
        mostrarProductoresPorTipoVegetal(arbolProductores.getRaiz(), "Raíz");

        System.out.println("\nb) Mostrar al productor con la mayor cantidad de producción:");
        mostrarProductorMayorProduccion(arbolProductores.getRaiz());

        System.out.println("\nc) Mostrar a los productores de la localidad 'Cochabamba' con mayor cantidad de hectáreas del vegetal de tipo 'Hoja':");
        mostrarProductoresPorLocalidadYTipo(arbolProductores.getRaiz(), "Cochabamba", "Hoja");
    }
    
    public static void asignarVegetales(NodoProductoresVegetales nodo) {
        if (nodo != null) {
            AB_NormalVegetales arbolVegetales = new AB_NormalVegetales();
            arbolVegetales.crearPorDefecto();
            nodo.getProVe().setAb_NormalVegetales(arbolVegetales);

            asignarVegetales(nodo.getIzq());
            asignarVegetales(nodo.getDer());
        }
    }

    // a.
    public static void mostrarProductoresPorTipoVegetal(NodoProductoresVegetales nodo, String tipoVegetal) {
        if (nodo != null) {
            AB_NormalVegetales arbolVegetales = nodo.getProVe().getAb_NormalVegetales();
            if (contieneTipo(arbolVegetales.getRaiz(), tipoVegetal)) {
                System.out.println("- " + nodo.getProVe().getNombreProductor());
            }
            mostrarProductoresPorTipoVegetal(nodo.getIzq(), tipoVegetal);
            mostrarProductoresPorTipoVegetal(nodo.getDer(), tipoVegetal);
        }
    }

    public static boolean contieneTipo(NodoVegetales nodo, String tipo) {
        if (nodo == null) return false;
        if (nodo.getVegetales().getTipoVegetal().equals(tipo)) return true;
        return contieneTipo(nodo.getIzq(), tipo) || contieneTipo(nodo.getDer(), tipo);
    }

    // b.
    public static void mostrarProductorMayorProduccion(NodoProductoresVegetales nodo) {
        ProductoresVegetales mayor = encontrarMayorProduccion(nodo, null);
        if (mayor != null) {
            System.out.println("- " + mayor.getNombreProductor());
        }
    }

    public static ProductoresVegetales encontrarMayorProduccion(NodoProductoresVegetales nodo, ProductoresVegetales mayor) {
        if (nodo == null) return mayor;
        double produccionActual = calcularProduccionTotal(nodo.getProVe().getAb_NormalVegetales().getRaiz());
        if (mayor == null || produccionActual > calcularProduccionTotal(mayor.getAb_NormalVegetales().getRaiz())) {
            mayor = nodo.getProVe();
        }
        mayor = encontrarMayorProduccion(nodo.getIzq(), mayor);
        mayor = encontrarMayorProduccion(nodo.getDer(), mayor);
        return mayor;
    }

    public static double calcularProduccionTotal(NodoVegetales nodo) {
        if (nodo == null) return 0;
        return nodo.getVegetales().getProduccionMensual() + calcularProduccionTotal(nodo.getIzq()) + calcularProduccionTotal(nodo.getDer());
    }

    // c.
    public static void mostrarProductoresPorLocalidadYTipo(NodoProductoresVegetales nodo, String localidad, String tipo) {
        if (nodo != null) {
            if (nodo.getProVe().getLocalidadProductor().equals(localidad)) {
                double hectareas = calcularHectareasPorTipo(nodo.getProVe().getAb_NormalVegetales().getRaiz(), tipo);
                if (hectareas > 0) {
                    System.out.println("- " + nodo.getProVe().getNombreProductor() + " con " + hectareas + " hectáreas de vegetales tipo " + tipo);
                }
            }
            mostrarProductoresPorLocalidadYTipo(nodo.getIzq(), localidad, tipo);
            mostrarProductoresPorLocalidadYTipo(nodo.getDer(), localidad, tipo);
        }
    }

    public static double calcularHectareasPorTipo(NodoVegetales nodo, String tipo) {
        if (nodo == null) return 0;
        double hectareas = nodo.getVegetales().getTipoVegetal().equals(tipo) ? nodo.getVegetales().getHectareas() : 0;
        return hectareas + calcularHectareasPorTipo(nodo.getIzq(), tipo) + calcularHectareasPorTipo(nodo.getDer(), tipo);
    }
}
