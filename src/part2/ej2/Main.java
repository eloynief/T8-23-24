package part2.ej2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Scanner sc;
		
		int numeros=0;
		
		int cont=0;
		
		int media=0;
		
		try {
			
			sc=new Scanner(new FileReader("src/part2/ej2/Enteros"));
			
			
			numeros+=sc.nextInt();
			
			
			while(sc.hasNextInt()) {

				
				
				numeros+=sc.nextInt();
				
				
				cont+=1;
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.err.println(e);
		}
		
		media=numeros/cont;

		System.out.println(media);
		
		
	}

}
