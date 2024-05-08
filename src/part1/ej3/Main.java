package part1.ej3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//objeto de tipo cuentaCorriente
		CuentaCorriente cuenta;
		
		//objeto scanner
		Scanner sc=new Scanner(System.in);
		//variables
		String dni="";
		double saldo=0;
		String nombre="";
		int opcion=0;
		
		boolean confirmacion=false;
		
		
		double dinero=0;
		
		
		System.out.println("Introduce el dni: ");
		dni=sc.next();
		sc.nextLine();
		
		System.out.println("Introduce el nombre: ");
		nombre=sc.next();
		sc.nextLine();
		

		//creas la cuenta
		cuenta=new CuentaCorriente(saldo, dni,nombre);
		
		
		do {

			//
			menu();
			
			System.out.print("Elige una opcion: ");
			//
			opcion=sc.nextInt();

			switch(opcion) {
			case 1:{

				System.out.println("Introduce el saldo a sacar: ");

				dinero=sc.nextDouble();
				
				confirmacion=cuenta.sacaDinero(dinero);

				//cuenta.sacaDinero(dinero);
				
				if(confirmacion) {
					System.out.println("Se ha sacado el dinero correctamente!!!");
				}
				else {
					System.out.println("No hay dinero suficiente...");
				}
				
				
				break;
			}
			case 2:{
				
				System.out.println("Introduce el saldo a poner: ");

				dinero=sc.nextDouble();
				
				
				cuenta.ingresaDinero(dinero);
				
				break;
			}
			case 3:{

				//cuenta.mostrarInfo();

				System.out.println(cuenta);
				
				break;
			}
			}
			
		}while(opcion!=0);
		
		
//		dni=sc.next();
//		sc.nextLine();
//		
//		saldo=sc.nextDouble();
//		
//		nombre=sc.next();
//		sc.nextLine();
		
		
		
		
		
		//cierre de scanner
		sc.close();
	}
	
	/**
	 * muestra el menu del programa
	 */
	public static void menu() {
		
		System.out.println("_______________________________");
		System.out.println("");
		System.out.println("Bienvenido a la cuenta que quieres hacer");
		System.out.println("");
		System.out.println("1.Sacar dinero");
		System.out.println("2.Ingresar dinero");
		System.out.println("3.Mostrar información");
		System.out.println("0. Salir");
		System.out.println("");
		System.out.println("_______________________________");
		
		
		
	}
	
	
	
	

}
