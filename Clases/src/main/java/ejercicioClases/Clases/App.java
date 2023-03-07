package ejercicioClases.Clases;
import java.util.ArrayList;
import java.util.List;
import entidades.CuentaCaixa;
import entidades.CuentaSantander;
import funciones.Herramientas;
import funciones.Ordenes;

public class App {
    public static void main(String[] args) {
        Herramientas hr = new Herramientas();
    	Ordenes or = new Ordenes();
    	String[] BankNames = {"caixa","sabadell","santander"};
		List<CuentaCaixa> caixaList = new ArrayList<CuentaCaixa>();
		List<CuentaSantander> santanderList = new ArrayList<CuentaSantander>();
		
		
		
		
    	
    	for (String name : BankNames)
    	{    		
    		
    		or.getDataFromTxt(name);
        		
    	}
    	
    	
    	
    	or.mostrarDatosDeBanco();
    	
    	
    	
    	
    	List<Object> listOrginal = or.uneTodosBancosEnUnaList();
    	
    	
    	List<Object>borrado = or.borreAlAzar();
    	
    	
    	

    	
    	or.CualEstaBorrado(listOrginal,borrado);
    	
    	
    	System.out.println("Cuenta total de banco santander es: "+ or.sumSantander(borrado));
    	System.out.println("Max saldo es: "+ or.saldoMax(borrado));
    	System.out.println("Numero de el cliente: " + CuentaSantander.getContador());

    	
    }
    	
}

  
