package part1.ej3;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CuentaCorriente {

	private double saldo=0;
	private String dni="";
	private String nombre="";
	
	
	//
	public CuentaCorriente(double saldo, String dni) {
		if (saldo>=0) {
			this.saldo = saldo;
		}
		if(dni!=null&&!dni.equals("")) {
			this.dni = dni;
		}
		
	}
	
	//
	public CuentaCorriente(double saldo, String dni, String nombre) {
		if (saldo>=0) {
			this.saldo = saldo;
		}
		if(dni!=null&&!dni.equals("")) {
			this.dni = dni;
		}
		if(nombre!=null&&!nombre.equals("")) {
			this.nombre = nombre;
		}
		
	}
	
	//getters setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	//saca el dinero guardado en la cuenta. Recibe como parametro el dinero a recoger y devuelve ese dinero
	public boolean sacaDinero(double dineroSacar) {
		
		boolean confirmacion=false;
		
		//si hay cantidad suficiente de dinero
		if(this.saldo>=dineroSacar) {
			
			confirmacion=true;
			
			//se resta la cantidad de dinero
			this.saldo=this.saldo-dineroSacar;

			
			
		}

		//se devuelve el dinero a sacar
		return confirmacion;
		
		
	}
	
	
	//ingresa dinero en la cuenta. No devuelve nada, solo recibe y aumenta
	public void ingresaDinero(double dineroPoner) {
		if(dineroPoner>0) {

			//
			this.saldo+=dineroPoner;
		}
		
	}
	
	
	//muestra la informacion de la persona cuando se llama la funcion
	public void mostrarInfo() {
		//se imprime todo

		System.out.println("Informacion del personal:");
		System.out.println("");
		System.out.println("Titular: "+this.nombre);
		System.out.println("DNI: "+this.dni);
		System.out.println("Saldo: "+this.saldo);
	}

	
	@Override
	public String toString() {
		String cadena="";
		
		cadena+="----------INFORMACION IMPRESA----------\n";
		cadena+="\n";
		cadena+="Saldo: "+this.saldo+"\n";
		cadena+="DNI: "+this.dni+"\n";
		cadena+="Nombre: "+this.nombre+"\n";
		cadena+="\n";
		cadena+="--------------------";
		
		return cadena;
	}
	
	
	
	
	
	
}
