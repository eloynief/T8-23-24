package part2.ej3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BufferedWriter bw;
		
		BufferedReader br;
		
		String linea;
		
		String[] arrayLinea;
		
		//try de br
		try {
			
			//lector
			br=new BufferedReader(new FileReader("src/part2/ej2/Enteros"));
			
			//try de leer lineas
			try {
				
				linea=br.readLine();

				while(linea!=null) {

					//guarda cada dato en un array de string separando por espacios
					arrayLinea=linea.split(" ");
					
					
					
					
					
					linea=br.readLine();
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			System.err.println(e);
		}
		
		
		
		
		
		
		
	}

}
