package Ejercicio_5;

public class NodoDueños {
	private Dueños dueños;
	private NodoDueños izq;
	private NodoDueños der;
	
	public NodoDueños() {
		izq = null;
		der = null;
	}
	public NodoDueños(Dueños d) {
		this.dueños = d;
		izq = null;
		der = null;
	}
	
	public Dueños getDueños() {
		return dueños;
	}
	public void setDueños(Dueños dueños) {
		this.dueños = dueños;
	}
	public NodoDueños getIzq() {
		return izq;
	}
	public void setIzq(NodoDueños izq) {
		this.izq = izq;
	}
	public NodoDueños getDer() {
		return der;
	}
	public void setDer(NodoDueños der) {
		this.der = der;
	}
	
}
