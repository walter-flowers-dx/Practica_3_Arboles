package Ejercicio_7;

public class Principal {

    public static void main(String[] args) {
        AB_NormalLetrasMayusculas z = new AB_NormalLetrasMayusculas();
        NodoLetrasMayusculas r = new NodoLetrasMayusculas();
        z.setRaiz(r);
        z.crear(z.getRaiz());
        System.out.println("Arbol en InOrden");
        z.inOrden(z.getRaiz());

        System.out.println("\na) Contar la cantidad de Nodos con 3 hijos");
        System.out.println("Resultado: " + contarNodosConTresHijos(z.getRaiz()));

        System.out.println("\nb) Contar cuantas veces se repite la letra X");
        char letraBuscada = 'X'; 
        System.out.println("Resultado: " + contarRepeticionesLetra(z.getRaiz(), letraBuscada));

        System.out.println("\nc) Mostrar el nivel con la mayor cantidad de nodos");
        System.out.println("Resultado: " + nivelConMayorCantidadNodos(z.getRaiz()));
    }

    // a.
    public static int contarNodosConTresHijos(NodoLetrasMayusculas R) {
        if (R == null) return 0;
        int hijos = 0;
        if (R.getIzq() != null) hijos++;
        if (R.getCentro() != null) hijos++;
        if (R.getDer() != null) hijos++;
        return (hijos == 3 ? 1 : 0) +
                contarNodosConTresHijos(R.getIzq()) +
                contarNodosConTresHijos(R.getCentro()) +
                contarNodosConTresHijos(R.getDer());
    }

    // b.
    public static int contarRepeticionesLetra(NodoLetrasMayusculas R, char letra) {
        if (R == null) return 0;
        return (R.getLetra() == letra ? 1 : 0) +
                contarRepeticionesLetra(R.getIzq(), letra) +
                contarRepeticionesLetra(R.getCentro(), letra) +
                contarRepeticionesLetra(R.getDer(), letra);
    }

    // c.
    public static int nivelConMayorCantidadNodos(NodoLetrasMayusculas R) {
        int altura = calcularAltura(R);
        int maxNivel = -1, maxNodos = -1;
        for (int i = 0; i < altura; i++) {
            int nodosEnNivel = contarNodosEnNivel(R, i, 0);
            if (nodosEnNivel > maxNodos) {
                maxNodos = nodosEnNivel;
                maxNivel = i;
            }
        }
        return maxNivel;
    }
    
    public static int calcularAltura(NodoLetrasMayusculas R) {
        if (R == null) return 0;
        return 1 + Math.max(
                Math.max(calcularAltura(R.getIzq()), calcularAltura(R.getCentro())),
                calcularAltura(R.getDer())
        );
    }

    public static int contarNodosEnNivel(NodoLetrasMayusculas R, int nivelObjetivo, int nivelActual) {
        if (R == null) return 0;
        if (nivelActual == nivelObjetivo) return 1;
        return contarNodosEnNivel(R.getIzq(), nivelObjetivo, nivelActual + 1) +
                contarNodosEnNivel(R.getCentro(), nivelObjetivo, nivelActual + 1) +
                contarNodosEnNivel(R.getDer(), nivelObjetivo, nivelActual + 1);
    }
}
