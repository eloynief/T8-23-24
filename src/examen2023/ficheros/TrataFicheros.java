package examen2023.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import examen2023.Medicamento;
import examen2023.excepciones.ValorInvalidoException;

public class TrataFicheros {
	
	/*
	 * constante para el fichero
	 */
	public static final String NOMBRE_FICHERO = "src/examen2023/ficheros/medicamentos.txt";

	
	/**
	 * 
	 * @param coleccionMedicamentos devuelve lo escrito del texto como un TreeSet de medicamento
	 */
	 public static TreeSet<Medicamento> leeFichero() {
		 
		 TreeSet<Medicamento> coleccionMedicamentos=new TreeSet<Medicamento>();
		 
		 Medicamento medicamento;
		 
		 String linea="";
		 
		 
		 
		 //array de string que guarda los valores de cada cosa
		 String[] arrayValores;

		 //variables que recogen los valores
		 int codigo=0;
		 String nombre="";
		 String desc="";
		 double precio=0;
		 String posologia="";
		 
		 
		 //try de br y de lectura
		 try {
			 BufferedReader br= new BufferedReader(new FileReader(NOMBRE_FICHERO));
			 
			 //hacer lectura de la primera linea
			 linea=br.readLine();
			 
			 //mientras que haya texto
			 while(linea!=null) {
				 
				 
				 arrayValores=linea.split(";");
				 
				 //hazlo asi con todas las vars
				 codigo=Integer.parseInt(arrayValores[0]);
				 nombre=arrayValores[1];
				 desc=arrayValores[2];
				 precio=Double.parseDouble(arrayValores[3]);
				 posologia=arrayValores[4];
				 
				 
				 
				 //usa todas las vars
				 try {
					medicamento=new Medicamento(codigo,nombre,desc,precio,posologia);

					coleccionMedicamentos.add(medicamento);

				 } catch (ValorInvalidoException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
				 }//end trycatch para el objeto
				 
				 //pasamos a la siguiente linea
				 linea=br.readLine();
				 
				 
			 }
			 
			 
		} catch (IOException e) {
			System.err.println("La ruta del fichero no es correcta");
			System.err.println(e.getMessage());
		}//end catch br new
		 
		 
		 return coleccionMedicamentos;
		 
	 }
	
	 /**
	  * 
	  * @param coleccionMedicamentos coleccion que le pasamos para introducirla al texto
	  */
	 public static void escribeFichero(Set<Medicamento> coleccionMedicamentos) {
		 
//		 boolean res=false;
		 BufferedWriter bw;
		 
		 String linea;
		 
		 try {
			bw= new BufferedWriter(new FileWriter(NOMBRE_FICHERO));
			//leemos la coleccion que le pasamos
			for (Medicamento med: coleccionMedicamentos) {
				//
				linea="";//revolvemos el valor a vacio para que no se acumule
				linea+=med.getCodigo()+";";
				linea+=med.getNombre()+";";
				linea+=med.getDesc()+";";
				linea+=med.getPrecio()+";";
				linea+=med.getPosologia()+";";
				
				bw.write(linea);
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			
//			if(bw!=null) {
//				
//			}
			
		} catch (IOException e) {
			System.err.println("La ruta del fichero no es correcta");
			System.err.println(e.getMessage());
		}
		 
//		 return res;
		 
	 }
	
	
}
