package part2.ej5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String nombre;
		int edad;
		
		System.out.println("Escribe nombre: ");
		nombre=sc.nextLine();
//		sc.nextLine();
		
		
		System.out.println("Escribe edad: ");
		edad=sc.nextInt();
		
		if(escribeFichero("Nombre: "+nombre+", Edad: "+edad)) {
			System.out.println("Se ha introducido el dato en el texto");
		}
		
		
	}
	
	
	
	
	public static boolean escribeFichero(String contenido) {
		boolean comp=true;
		
		BufferedWriter bw = null;
		
		try {
			bw=new BufferedWriter(new FileWriter("src/part2/ej5/datos.txt",true));
			
			bw.write(contenido);
			
		} catch (IOException e) {
			
			comp=false;
			
			System.err.println("El archivo es invalido");
		}finally {
			
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return comp;
	}

}
