package ejercicioClases.Clases;

import java.time.LocalDate;

public class Cliente {

	private String id;
	private String name;
	private LocalDate fechaNacimiento;
	
	
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


	public Cliente(String id, String name, LocalDate fechaNacimiento) {
		super();
		this.id = id;
		this.name = name;
		this.fechaNacimiento = fechaNacimiento;
	}
	

}
