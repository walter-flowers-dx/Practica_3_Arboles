//Lic. Marcelo Aruquipa
package Ejercicio_7;

public class NodoLetrasMayusculas {
    private char letra;
    private NodoLetrasMayusculas izq;
    private NodoLetrasMayusculas centro;
    private NodoLetrasMayusculas der;

    public NodoLetrasMayusculas() {
        izq = null;
        centro = null;
        der = null;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public NodoLetrasMayusculas getIzq() {
        return izq;
    }

    public void setIzq(NodoLetrasMayusculas izq) {
        this.izq = izq;
    }

    public NodoLetrasMayusculas getCentro() {
        return centro;
    }

    public void setCentro(NodoLetrasMayusculas centro) {
        this.centro = centro;
    }

    public NodoLetrasMayusculas getDer() {
        return der;
    }

    public void setDer(NodoLetrasMayusculas der) {
        this.der = der;
    }
}
