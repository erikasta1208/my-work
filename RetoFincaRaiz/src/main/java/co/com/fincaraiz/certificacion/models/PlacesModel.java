package co.com.fincaraiz.certificacion.models;

public class PlacesModel {

	public String department;
	public String city;
	public int quantityProperties;
	
	private PlacesModel(String department, String city, int quantityProperties) {
		this.department = department;
		this.city = city;
		this.quantityProperties = quantityProperties;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getQuantityProperties() {
		return quantityProperties;
	}

	public void setQuantityProperties(int quantityProperties) {
		this.quantityProperties = quantityProperties;
	}
	
	
}
