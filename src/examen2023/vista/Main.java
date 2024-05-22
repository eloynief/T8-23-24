package examen2023.vista;

import java.util.Scanner;

import examen2023.Medicamento;
import examen2023.crud.CRUDMedicamentos;
import examen2023.excepciones.ValorInvalidoException;
import examen2023.ficheros.TrataFicheros;

public class Main {

	private static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) throws ValorInvalidoException {
		// TODO Auto-generated method stub
		

		 Medicamento medicamento = null;
		 

		 //variables que recogen los valores
		 int codigo=0;
		 String nombre="";
		 String desc="";
		 double precio=0;
		 String posologia="";
		 
		
		int opcion=0;
		
		//lectura del fichero
		CRUDMedicamentos.coleccionMedicamentos=TrataFicheros.leeFichero();
		
		
		do {
			
			menu();
			
			
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1:{

				
				medicamento=escribeMedicamento();
				
                if(CRUDMedicamentos.add(medicamento)) {
					System.out.println("El medicamento se ha add");
				}
				else {
					System.out.println("NO SE HA PODIDO add");
				}
                
				break;
			}
			case 2:{
				
				CRUDMedicamentos.listar();
				
				break;
			}
			case 3:{

				medicamento=escribeMedicamento();
				
                if(CRUDMedicamentos.modifyMedicamento(medicamento)) {
					System.out.println("El medicamento se ha modificado de la existencia");
				}
				else {
					System.out.println("NO SE HA PODIDO modificado");
				}
				
				break;
			}
			case 4:{
				

//				medicamento=escMed();

				System.out.println("Escribe el nombre: ");
				nombre=sc.nextLine();
				sc.nextLine();
				
				if(CRUDMedicamentos.delete(nombre)) {
					System.out.println("El medicamento se ha borrado de la existencia");
				}
				else {
					System.out.println("NO SE HA PODIDO BORRAR");
				}
                
				

				break;
			}
			case 5:{
				
				TrataFicheros.escribeFichero(CRUDMedicamentos.coleccionMedicamentos);

				break;
			}
			case 0:{
				
				System.out.println("Saliendo...");

				break;
			}
			default:{
				System.out.println("Opicon no valda");
			}
			
			}
			
			
			
			
			
			
		}while(opcion!=0);
		
		
		
	}
	
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1 Anadir");
		System.out.println("2 Listar");
		System.out.println("3 Modificar");
		System.out.println("4 Eliminar");
		System.out.println("5 Guardar");
		System.out.println("0 Salir");
		System.out.println("--------");
	}
	
	
	

	//funciones de escritura
	
	/**
	 * funcion para escribir un medicamento para ponerlo al constructor con todos los params
	 * @return
	 */
	public static Medicamento escribeMedicamento() {

		 Medicamento medicamento = null;
		 

		 //variables que recogen los valores
		 int codigo=0;
		 String nombre="";
		 String desc="";
		 double precio=0;
		 String posologia="";
		 
		
		System.out.println("Escribe el codigo: ");
		codigo=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Escribe el nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Escribe el desc: ");
		desc=sc.nextLine();

		System.out.println("Escribe el precio: ");
		precio=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Escribe el posologia: ");
		posologia=sc.nextLine();

		try {
			medicamento=new Medicamento(codigo, nombre, desc, precio, posologia);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return medicamento;
	}
	
	

	
	
	
	
	

}
