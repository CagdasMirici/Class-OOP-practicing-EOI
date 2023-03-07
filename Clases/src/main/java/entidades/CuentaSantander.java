package entidades;
public class CuentaSantander extends Banco{
	private Cuenta cuenta;
	private double saldo;
	private boolean viveEnSantander;
	private static int contador;
	
	
	
	
	
	
	

	public CuentaSantander(Cuenta cuenta, double saldo,boolean viveEnSantander,String bancoNombre) {
		super(bancoNombre);
		this.saldo = saldo;
		this.cuenta = cuenta;
		this.viveEnSantander = viveEnSantander;
		contador++;
		
		
		
		
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}
	
	

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	

	public static int getContador() {
		return contador;
	}
	
	

	public double getSaldo() {
		return saldo;
	}
	
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

	public boolean isViveEnSantander() {
		return viveEnSantander;
	}
	
	
	public static void setContador(int contador) {
		CuentaSantander.contador = contador;
	}

	public void setViveEnSantander(boolean viveEnSantander) {
		this.viveEnSantander = viveEnSantander;
	}

	public String toString() {
	
	
	String texto = "Id = "+this.getCuenta().getId()+"; Name = "+this.getCuenta().getName()+"; FechaNacimiento = "+this.getCuenta().getId()+"; CodigoPais = "+this.getCuenta().getCodigoPais()+"; Saldo "+this.getSaldo()+"; Vive en Santander = "+this.isViveEnSantander()+"; Nombrebanco = " + this.getBancoNombre();
		
		return texto;
		
	
	
	
}
	

	
	
	
	
	
	
	
	
}
