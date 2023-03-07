package entidades;

public abstract class Banco {

	private String bancoNombre;
	
	
	
	
	
	public Banco(String name) {
		this.bancoNombre = name;
		
	}
	
	
	
	
	public String getBancoNombre() {
		return bancoNombre;
	}

	public void setBancoNombre(String bancoNombre) {
		this.bancoNombre = bancoNombre;
	}
	
	
	

}
