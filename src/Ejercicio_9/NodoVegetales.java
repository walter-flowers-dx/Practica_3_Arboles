package Ejercicio_9;

public class NodoVegetales {
	private Vegetales vegetales;
	private NodoVegetales izq;
	private NodoVegetales der;
	
	public NodoVegetales() {
		izq = null;
		der = null;
	}
	public NodoVegetales(Vegetales v) {
		this.vegetales = v;
		izq = null;
		der = null;
	}
	
	public Vegetales getVegetales() {
		return vegetales;
	}
	public void setVegetales(Vegetales vegetales) {
		this.vegetales = vegetales;
	}
	public NodoVegetales getIzq() {
		return izq;
	}
	public void setIzq(NodoVegetales izq) {
		this.izq = izq;
	}
	public NodoVegetales getDer() {
		return der;
	}
	public void setDer(NodoVegetales der) {
		this.der = der;
	}
	
}
