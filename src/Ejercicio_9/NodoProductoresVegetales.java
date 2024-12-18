package Ejercicio_9;

public class NodoProductoresVegetales {
	private ProductoresVegetales proVe;
	private NodoProductoresVegetales izq;
	private NodoProductoresVegetales der;
	
	public NodoProductoresVegetales() {
		izq = null;
		der = null;
	}
	public NodoProductoresVegetales(ProductoresVegetales pv) {
		this.proVe = pv;
		izq = null;
		der = null;
	}
	
	public ProductoresVegetales getProVe() {
		return proVe;
	}
	public void setProVe(ProductoresVegetales proVe) {
		this.proVe = proVe;
	}
	public NodoProductoresVegetales getIzq() {
		return izq;
	}
	public void setIzq(NodoProductoresVegetales izq) {
		this.izq = izq;
	}
	public NodoProductoresVegetales getDer() {
		return der;
	}
	public void setDer(NodoProductoresVegetales der) {
		this.der = der;
	}
	
}
