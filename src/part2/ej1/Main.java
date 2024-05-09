package part2.ej1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//arraylist de ints
		List<Integer> listaNumeros=new ArrayList<Integer>();

		FileReader fr = null;
		int num=0;
		
		int numLista=0;
		
		try {
			fr= new FileReader("src\\part2\\NumerosReales");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		do {
			
			try {
				num=fr.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(num);
			
		}while(num!=-1);
		
	}

}
