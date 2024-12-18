package Ejercicio_9;

public class Vegetales {
	private String nombreVegetal;
	private String tipoVegetal;
	private double produccionMensual;
	private double hectareas;
	public Vegetales(String nombreVegetal, String tipoVegetal, double produccionMensual, double hectareas) {
		super();
		this.nombreVegetal = nombreVegetal;
		this.tipoVegetal = tipoVegetal;
		this.produccionMensual = produccionMensual;
		this.hectareas = hectareas;
	}
	public String getNombreVegetal() {
		return nombreVegetal;
	}
	public void setNombreVegetal(String nombreVegetal) {
		this.nombreVegetal = nombreVegetal;
	}
	public String getTipoVegetal() {
		return tipoVegetal;
	}
	public void setTipoVegetal(String tipoVegetal) {
		this.tipoVegetal = tipoVegetal;
	}
	public double getProduccionMensual() {
		return produccionMensual;
	}
	public void setProduccionMensual(double produccionMensual) {
		this.produccionMensual = produccionMensual;
	}
	public double getHectareas() {
		return hectareas;
	}
	public void setHectareas(double hectareas) {
		this.hectareas = hectareas;
	}
	
	public void mostrar() {
		System.out.println("Datos de los Vegetales: ");
		System.out.println("Nombre Vegetal: " +nombreVegetal);
		System.out.println("Tipo Vegetal: " + tipoVegetal);
		System.out.println("Produccion Mensual: " + produccionMensual);
		System.out.println("Hectareas: " + hectareas);
	}
}
