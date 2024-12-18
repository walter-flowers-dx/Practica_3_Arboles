package Ejercicio_5;

import java.util.Scanner;

public class Dueños {
	private int idDueño;
	private String nombreDueño;
	private int celDueño;
	public Dueños(int idDueño, String nombreDueño, int celDueño) {
		super();
		this.idDueño = idDueño;
		this.nombreDueño = nombreDueño;
		this.celDueño = celDueño;
	}
	public int getIdDueño() {
		return idDueño;
	}
	public void setIdDueño(int idDueño) {
		this.idDueño = idDueño;
	}
	public String getNombreDueño() {
		return nombreDueño;
	}
	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	public int getCelDueño() {
		return celDueño;
	}
	public void setCelDueño(int celDueño) {
		this.celDueño = celDueño;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: ");
		idDueño = lee.nextInt();
		nombreDueño = lee.next();
		celDueño = lee.nextInt();
	}
	
	public void mostrar() {
		System.out.println("\nDatos de los dueños: ");
		System.out.println("ID Dueño: " + idDueño);
		System.out.println("Nombre dueño: " + nombreDueño);
		System.out.println("Cel. Dueño: " + celDueño);
	}
}
