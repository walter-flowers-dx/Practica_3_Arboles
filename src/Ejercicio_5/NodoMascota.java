//Lic. Marcelo Aruquipa
package Ejercicio_5;

public class NodoMascota {
	private Mascota mascota;
	private NodoMascota izq;
	private NodoMascota der;
	
	public NodoMascota() {
		izq = null;
		der = null;
	}
	public NodoMascota(Mascota m) {
		this.mascota = m;
		izq = null;
		der = null;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public NodoMascota getIzq() {
		return izq;
	}

	public void setIzq(NodoMascota izq) {
		this.izq = izq;
	}

	public NodoMascota getDer() {
		return der;
	}

	public void setDer(NodoMascota der) {
		this.der = der;
	}
	
	
}
