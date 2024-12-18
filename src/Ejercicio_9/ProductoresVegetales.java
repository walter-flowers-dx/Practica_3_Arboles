package Ejercicio_9;

public class ProductoresVegetales {
	private int idProductor;
	private String nombreProductor;
	private String localidadProductor;
	private AB_NormalVegetales ab_NormalVegetales;
	public ProductoresVegetales(int idProductor, String nombreProductor, String localidadProductor,
			AB_NormalVegetales ab_NormalVegetales) {
		super();
		this.idProductor = idProductor;
		this.nombreProductor = nombreProductor;
		this.localidadProductor = localidadProductor;
		this.ab_NormalVegetales = ab_NormalVegetales;
	}
	public int getIdProductor() {
		return idProductor;
	}
	public void setIdProductor(int idProductor) {
		this.idProductor = idProductor;
	}
	public String getNombreProductor() {
		return nombreProductor;
	}
	public void setNombreProductor(String nombreProductor) {
		this.nombreProductor = nombreProductor;
	}
	public String getLocalidadProductor() {
		return localidadProductor;
	}
	public void setLocalidadProductor(String localidadProductor) {
		this.localidadProductor = localidadProductor;
	}
	public AB_NormalVegetales getAb_NormalVegetales() {
		return ab_NormalVegetales;
	}
	public void setAb_NormalVegetales(AB_NormalVegetales ab_NormalVegetales) {
		this.ab_NormalVegetales = ab_NormalVegetales;
	}
	
	public void mostrar() {
		System.out.println("Datos del Productor: ");
		
	}
}
