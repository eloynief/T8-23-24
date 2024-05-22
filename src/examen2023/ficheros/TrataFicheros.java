package examen2023.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import examen2023.Medicamento;

public class TrataFicheros {
	
	public static final String NOMBRE_FICHERO = "src/examen2023/ficheros/medicamentos.txt";

	
	/**
	 * 
	 * @param coleccionMedicamentos
	 */
	 public static TreeSet<Medicamento> leeFichero() {
		 
		 TreeSet<Medicamento> coleccionMedicamentos=new TreeSet<Medicamento>();
		 
		 Medicamento medicamento;
		 
		 String linea="";
		 
		 int codigo=0;
		 
		 
		 
		 //array de string que guarda los valores de cada cosa
		 String[] arrayValores;
		 
		 try {
			 BufferedReader br= new BufferedReader(new FileReader(NOMBRE_FICHERO));
			 
			 linea=br.readLine();
			 
			 while(linea!=null) {
				 
				 
				 arrayValores=linea.split(";");
				 
				 //hazlo asi con todas las vars
				 codigo=Integer.parseInt(arrayValores[0]);
				 
				 
				 //usa todas las vars
				 medicamento=new Medicamento(codigo);
				 
						 
				 coleccionMedicamentos.add(medicamento);

				 linea=br.readLine();
				 
				 
			 }
			 
			 
		} catch (IOException e) {
			System.err.println("La ruta del fichero no es correcta");
			System.err.println(e.getMessage());
		}
		 
		 
		 return coleccionMedicamentos;
		 
	 }
	
	 /**
	  * 
	  * @param coleccionMedicamentos la coleccion que tenemos
	  */
	 public static void escribeFichero(Set<Medicamento> coleccionMedicamentos) {
		 
		 String linea;
		 
		 try {
			BufferedWriter bw= new BufferedWriter(new FileWriter(NOMBRE_FICHERO));
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
			
		} catch (IOException e) {
			System.err.println("La ruta del fichero no es correcta");
			System.err.println(e.getMessage());
		}
		 
	 }
	
	
}
