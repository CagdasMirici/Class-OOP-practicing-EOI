package funciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import entidades.Cuenta;
import entidades.CuentaCaixa;
import entidades.CuentaSabadell;
import entidades.CuentaSantander;
import enumeradores.NivelCatalan;
import enumeradores.NivelCatalan.catalan;

public class Herramientas {
	Scanner scanner = new Scanner(System.in);
	
	
	
	
	
	public List<String[]> sacarElDatoDeTxt(String fileName) {
		
		List<String[]> dataList = new ArrayList<>();
		String[] dataArr = null;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		
		
	   	File file = new File("/Users/jcteb1/Desktop/EOI/BankApp/BankApp/"+fileName+".txt");
	   	
	   	        
	   	        BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						
						
						
					} catch (FileNotFoundException e) {
						
						e.printStackTrace();
					}
	   	 
	   	        String st = null;
	   	        
	   	        try {
						while ((st = br.readLine()) != null) {
	 	 
						    
							
							
							dataArr =  st.split(";");
							
							
							dataList.add(dataArr);
							
						    
						}
						
						
						     
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			
	   	    
	   	     return dataList;
	     		
	}
	
	
		
		public catalan collectNivelCatalan() {
			
			boolean loop = true;

			
			
			NivelCatalan.catalan ct = null;
			
			
			while(loop){
				System.out.println("por favor entrega el nivel de catalan de el cliente: ");
				System.out.println("si es bajo entrega 1");
				System.out.println("si es medio entrega 2");
				System.out.println("si es alto entrega 3");
				
				String nv = scanner.next();
			
				switch(nv) {
				
				case "1":
					
					ct = NivelCatalan.catalan.Bajo;
					System.out.println(ct.toString());
					loop = false;
					
					
				case "2":
					ct =  NivelCatalan.catalan.Medio;
					loop = false;
					break;
				case "3": 
					ct = NivelCatalan.catalan.Alto;
					loop = false;
					break;
				default:
					
					
					System.out.println("Solo puedes entregar 1/Bajo, 2/Medio, 3/Alto");
					break;
					
				}
				
				
			}	
			return ct;
		}
		
		
		public boolean SiviveEnSantander() {
			
			boolean siVive = true;
			boolean loop = true;
			System.out.println("Por favor entrega si cliente residente en Santander: si / no");
			
			
			
			while(loop){
				
				
				
				String res = scanner.next().toLowerCase();
			
			
			
				switch(res) {
				
				case "si":
					
					siVive =  true;
					loop = false;
					break;
					
				case "no":
					siVive = false;
					
					loop = false;
					break;
				default:
					
					
					System.out.println("Solo puedes entregar: si/no");
					loop = true;
					break;
				}
				
				
			}	
			
			
			return siVive;
			
			
			
		}
		
	
	
	
		
		
		
		}
		
		

	


