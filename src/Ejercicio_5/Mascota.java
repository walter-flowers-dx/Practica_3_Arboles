package Ejercicio_5;

import java.util.Scanner;

public class Mascota {
	private int idMascota;
	private String tipoMascota;
	private String nombreMascota;
	private String sexoMascota;
	private int edadMascota;
	private int idDueñoMascota;
	
	public Mascota(int idMascota, String tipoMascota, String nombreMascota, String sexoMascota, int edadMascota,
			int idDueñoMascota) {
		super();
		this.idMascota = idMascota;
		this.tipoMascota = tipoMascota;
		this.nombreMascota = nombreMascota;
		this.sexoMascota = sexoMascota;
		this.edadMascota = edadMascota;
		this.idDueñoMascota = idDueñoMascota;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public String getSexoMascota() {
		return sexoMascota;
	}
	public void setSexoMascota(String sexoMascota) {
		this.sexoMascota = sexoMascota;
	}
	public int getEdadMascota() {
		return edadMascota;
	}
	public void setEdadMascota(int edadMascota) {
		this.edadMascota = edadMascota;
	}
	public int getIdDueñoMascota() {
		return idDueñoMascota;
	}
	public void setIdDueñoMascota(int idDueñoMascota) {
		this.idDueñoMascota = idDueñoMascota;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: ");
		idMascota = lee.nextInt();
		tipoMascota = lee.next();
		nombreMascota = lee.next();
		sexoMascota = lee.next();
		edadMascota = lee.nextInt();
		idDueñoMascota = lee.nextInt();
	}
	
	public void mostrar() {
		System.out.println("\nDatos de la Mascota.- ");
		System.out.println("ID Mascota: " + idMascota);
		System.out.println("Tipo de Macota: " + tipoMascota);
		System.out.println("Nombre Mascota: " + nombreMascota);
		System.out.println("Sexo Mascota: " + sexoMascota);
		System.out.println("Edad Mascota: " + edadMascota);
		System.out.println("ID Dueño Mascota: " + idDueñoMascota);
	}
}
