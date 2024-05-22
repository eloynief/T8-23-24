package examen2023.excepciones;

public class FicheroInvalidoException extends Exception {
	
	@Override
	public String toString() {
		
		String str="";
		
		str+=super.toString()+"La ruta introducida no es valida";
		
		return str;
	}
	
}
