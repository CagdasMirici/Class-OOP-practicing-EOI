package entidades;

import enumeradores.NivelCatalan;

public class CuentaCaixa extends Banco implements NivelCatalan  {
	
	
	private Cuenta cuenta;
	private double saldo;
	private  catalan catalan;
	private static int contador;
	private String bancoNombre;
	
	
	
	
	public CuentaCaixa(Cuenta cuenta, double saldo, catalan catalan, String bancoNombre) {
		super(bancoNombre);
		this.cuenta = cuenta;
		this.saldo = saldo;
		this.catalan = catalan;
		contador++;
		
		
		
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public catalan getCatalan() {
		return catalan;
	}
	public void setCatalan(catalan catalan) {
		this.catalan = catalan;
	}
	public static int getContador() {
		return contador;
	}
	
	public static void setContador(int contador) {
		CuentaCaixa.contador = contador;
	}
	public String toString() {
		
		
		String texto = "Id = "+this.getCuenta().getId()+"; Name = "+this.getCuenta().getName()+"; FechaNacimiento = "+this.getCuenta().getId()+"; CodigoPais = "+this.getCuenta().getCodigoPais()+"; Saldo "+this.getSaldo()+"; NivelCatalan = "+this.getCatalan()+"; Nombrebanco = " + this.getBancoNombre();
			
			return texto;
			
		
		
		
	}
	
	

}
