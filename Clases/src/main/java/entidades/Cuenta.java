package entidades;

import java.time.LocalDate;

public class Cuenta {

	private String id;
	private String name;
	private LocalDate fechaNacimiento;
	private String codigoPais;
	

	public Cuenta(String id, String name, LocalDate fechaNacimiento,String codigoPais) {
		
		this.id = id;
		this.name = name;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoPais = codigoPais;
		
	}


	public String getCodigoPais() {
		return codigoPais;
	}


	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}




	
	

}
