package part1.ej2;

import java.util.Scanner;

public class Main {

	//objeto tipo scanner
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hora horaPuesta;
		
		HoraExacta horaExacta = null;
		
		
		boolean comprobacion=false;
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		

		horaExacta=new HoraExacta(hora, minuto, segundo);
		
		try {

			//te pide los datos para introducir
			System.out.println("Dime la hora: ");
					
			hora=sc.nextInt();
			
			horaExacta.setHora(hora);
			
		} catch (NegativeHourException e) {
			
			System.out.println("La hora es negativa");
			
		}
		
		try {

			//te pide los datos para introducir
			System.out.println("Dime el minuto: ");
					
			minuto=sc.nextInt();
			
			horaExacta.setMinuto(minuto);
			
		} catch (NegativeMinuteException e) {

			System.out.println("La minuto es negativa");
			
		}

		try {

			//te pide los datos para introducir
			System.out.println("Dime el segundo: ");
					
			segundo=sc.nextInt();
					
			horaExacta.setSegundo(segundo);
			
		} catch (NegativeSecondException e) {

			System.out.println("La segundo es negativa");
			
		}
		
		horaPuesta=new Hora(hora, minuto);
		
//		horaExacta=new HoraExacta(hora, minuto, segundo);
		
		System.out.println("DATOS:");
		
		System.out.println(horaPuesta);
		System.out.println(horaExacta);
		System.out.println();
		
		horaPuesta.inc();
		
		System.out.println("DESPUES DEL INCREMENTO:");
		
		System.out.println(horaPuesta);
		System.out.println(horaExacta);
		System.out.println();
		
		
		
	}

}
