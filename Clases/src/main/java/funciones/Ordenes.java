package funciones;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import entidades.Banco;
import entidades.Cuenta;
import entidades.CuentaCaixa;
import entidades.CuentaSabadell;
import entidades.CuentaSantander;
public class Ordenes {

	public List <CuentaSabadell> sabadellList = new ArrayList<CuentaSabadell>();
	public List <CuentaCaixa> caixaList = new ArrayList<CuentaCaixa>();
	public List <CuentaSantander> santanderList = new ArrayList<CuentaSantander>();
	List<Object> objectList = new ArrayList<>();
	Herramientas hr = new Herramientas();
	Scanner scanner = new Scanner(System.in);
	public void	getDataFromTxt(String fileName) {
		
		
		String[] dataArr = null;
		Banco bank = null;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		
		List<String[]> list = hr.sacarElDatoDeTxt(fileName);
		
		for(int i = 0; i < list.size()-1; i++) {
			
			String[] arr= list.get(i);
			
			String id = arr[0];
		     
		    String nombre = arr[1];   
		  
		    LocalDate fechaNacimiento = LocalDate.parse(arr[2], formatter);  
		    
		     String codigoPais = arr[3];
		     String bancoNombre = fileName;
		     
		     
		     Cuenta cu = new  Cuenta(id,nombre,fechaNacimiento,codigoPais);
		     
		     double saldo =Double.parseDouble(arr[4]);
		
			
			
		boolean catalan = true;
	    
	      
				
				if ( fileName == "caixa") {
					
					
					String a = String.format("Cliente con id "+ id+ " Nombre: "+nombre+" fecha de nacimiento: " + fechaNacimiento.toString()+" codigo de su pais: " +codigoPais+ fileName);						
					System.out.println(a);
					
					
					
					caixaList.add(new CuentaCaixa(cu,saldo,hr.collectNivelCatalan(),bancoNombre));
					
				}
				else if (fileName == "sabadell") {
					
					String a = String.format("Cliente con id "+ id+ " Nombre: "+nombre+" fecha de nacimiento: " + fechaNacimiento.toString()+" codigo de su pais: " +codigoPais + fileName);						
					System.out.println(a);
					
					sabadellList.add(new CuentaSabadell(cu,saldo,hr.collectNivelCatalan(),bancoNombre));
					
				}
				else if (fileName == "santander") {
					
					
					
					String a = String.format("Cliente con id "+ id+ " Nombre: "+nombre+" fecha de nacimiento: " + fechaNacimiento.toString()+" codigo de su pais: " +codigoPais+ fileName);						
					System.out.println(a);
					
					santanderList.add( new CuentaSantander(cu, saldo,hr.SiviveEnSantander(),bancoNombre));
										
				}
				
				


		
		}
		
	}
	
	
	public List <Object> uneTodosBancosEnUnaList(){
		
		objectList.addAll(sabadellList);
		objectList.addAll(caixaList);
		objectList.addAll(santanderList);
		
		
		
		return objectList;
		
	}
	
	
	
	
	
	public void mostrarDatosDeBanco() {
	
		List<Object> li = new ArrayList<>(objectList);
		boolean loop = true;
		System.out.println("Por Favor indique el nombre de el banco que quereis ver los datos");
		
		
		do 
		{

		System.out.println("Nombre de el banco: ");
		String nombre = scanner.nextLine().toLowerCase();
		
		
		if(nombre.equals("sabadell")) {
			
			System.out.println("Sabadell");
			
			
	    	li.stream()
	    			.filter(e -> e.getClass().getSimpleName().equals("CuentaSabadell"))
	    			.forEach(e-> System.out.println("Id = "+((CuentaSabadell) e).getCuenta().getId()+" Name = "+((CuentaSabadell) e).getCuenta().getName()+" FechaNacimiento = "+((CuentaSabadell) e).getCuenta().getId()+" CodigoPais = "+((CuentaSabadell) e).getCuenta().getCodigoPais()+" Saldo "+((CuentaSabadell)e).getSaldo()+" NivelCatalan = "+((CuentaSabadell) e).getCatalan()));
	    	loop = false;
		}
		else if(nombre.equals("santander")) {
			
			System.out.println("santander");
			
			
	    	li.stream()
	    			.filter(e -> e.getClass().getSimpleName().equals("CuentaSantander"))
	    			.forEach(e-> System.out.println("Id = "+((CuentaSantander) e).getCuenta().getId()+" Name = "+((CuentaSantander) e).getCuenta().getName()+" FechaNacimiento = "+((CuentaSantander) e).getCuenta().getId()+" CodigoPais = "+((CuentaSantander) e).getCuenta().getCodigoPais()+" Saldo "+((CuentaSantander)e).getSaldo()+" NivelCatalan = "+((CuentaSantander) e).isViveEnSantander()));
	    	loop = false;
		}
		
		else if(nombre.equals("caixa")) {
			
			System.out.println("caixa");
			
			
	    	li.stream()
	    			.filter(e -> e.getClass().getSimpleName().equals("CuentaCaixa"))
	    			.forEach(e-> System.out.println("Id = "+((CuentaCaixa) e).getCuenta().getId()+" Name = "+((CuentaCaixa) e).getCuenta().getName()+" FechaNacimiento = "+((CuentaCaixa) e).getCuenta().getId()+" CodigoPais = "+((CuentaCaixa) e).getCuenta().getCodigoPais()+" Saldo "+((CuentaCaixa)e).getSaldo()+" NivelCatalan = "+((CuentaCaixa) e).getCatalan()));
	    	loop = false;
		}
		else {
			
			System.out.println("Solo puedes ver los datos de sabadell, santander, caixa");
			loop = true;
			
		}
		
		}while(loop);
	}
	
	
	
	public List<Object> borreAlAzar()
	{	
		
		
	

		
		 Random rand = new Random();
		 int randomIndex = rand.nextInt(objectList.size());
		 List<Object> borrada = new ArrayList<>(objectList);
		 
		
		if(((Banco) borrada.get(randomIndex)).getBancoNombre().equals("caixa"))
		{
			
			CuentaCaixa.setContador( CuentaCaixa.getContador()-1);  
			
		}
		else if(((Banco) borrada.get(randomIndex)).getBancoNombre().equals("santander"))
		{
			
			CuentaSantander.setContador( CuentaSantander.getContador()-1); 
			
		}
		else if(((Banco) borrada.get(randomIndex)).getBancoNombre().equals("sabadell"))
		{
			
			CuentaSabadell.setContador( CuentaSabadell.getContador()-1); 
			
		}
		 
		 
		 borrada.remove(randomIndex);
		
		
		
		return borrada;
		
		
	}
	
	
	
	
	public void CualEstaBorrado(List <Object>orginal,List <Object> listBorrado) {
		
		
	
		
		for(int i = 0; i < orginal.size();i++)
		{
			
		
			
				if(!listBorrado.contains(orginal.get(i)))
				{
					System.out.println("El cliente borrado es: ");
					System.out.println(((Banco) orginal.get(i)).getBancoNombre());
					System.out.println(orginal.get(i));
					
				
				
			}
			
			
			
		}
		
}
	

	public double sumSantander(List<Object> li) {
		
		double total = 0;
		List<Object> santanderList = (List<Object>) li.stream()
		.filter(e-> ((Banco) e).getBancoNombre().equals("santander"))
		.collect(Collectors.toList());
		
		for(Object x : santanderList)	
		{
			
			total += ((CuentaSantander) x).getSaldo();
			
		}
		
		
		
		return total;
		
	}

	
	public double saldoMax(List<Object> li)
	{
		
		
		double max = Double.MIN_VALUE;
		
		List<Object> santanderList = (List<Object>) li.stream()
				.filter(e-> ((Banco) e).getBancoNombre().equals("santander"))
				.collect(Collectors.toList());
		
		for(Object x : santanderList)	
		{
			
			if (((CuentaSantander) x).getSaldo() > max) {
				
				
				max = ((CuentaSantander) x).getSaldo();
				
				
			}
			
		}
		
				
		return max;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}