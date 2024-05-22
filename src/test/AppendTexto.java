package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendTexto {

	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedWriter bw=null;
		
		String texto="";
		

		
		try {
			bw=new BufferedWriter(new FileWriter("src/part2/ej4/TextoNuevo.txt"));
			
			//mientras la cadena no sea fin
			while(!texto.equalsIgnoreCase("fin")) {
				
				System.out.println("Escribe texto hasta escribir fin...");
				
				texto=sc.next();
				
				if(!texto.equalsIgnoreCase("fin"))	bw.write(texto);
				
				bw.newLine();
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error de: "+ e);
		}
		finally {
			
			try {
				bw.flush();

				bw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end catch close
			
		}//
		
		
		
		
	}

}
