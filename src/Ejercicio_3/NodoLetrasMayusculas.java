//Lic. Marcelo Aruquipa
package Ejercicio_3;

public class NodoLetrasMayusculas {
	private char letra;
	private NodoLetrasMayusculas izq;
	private NodoLetrasMayusculas der;
	
	public NodoLetrasMayusculas() {
		izq = null;
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

	public NodoLetrasMayusculas getDer() {
		return der;
	}

	public void setDer(NodoLetrasMayusculas der) {
		this.der = der;
	}
	
	
}
