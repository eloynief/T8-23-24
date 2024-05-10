package part2.ej1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//arraylist de ints
		List<Integer> listaNumeros=new ArrayList<Integer>();

		BufferedReader br = null;
		int num=0;
		int numParse = 0;
		int numLista=0;
		String linea="";
		try {
			br = new BufferedReader(new FileReader("src/part2/ej1/NumerosReales"));
			
			//leemos
			try {
				linea=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(linea!=null) {
				
				
				numParse+=Integer.parseInt(linea);
				
				
				listaNumeros.add(numParse);
				
				try {
					linea=br.readLine();
					
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se ha encontrado");
			System.out.println(e);
		}
		
		
		
		System.out.println(listaNumeros);
		

        // Mostrar los números en la lista
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }
		
		
	}

}
