package examen2023.excepciones;

public class ValorInvalidoException extends Exception{
	
	@Override
	public String toString() {
		
		String str="";
		
		str+=super.toString()+"El valor introducido no es valido";
		
		return str;
	}
	
	@Override
	public String getMessage() {

		String str="";
		
		str+=super.getMessage()+"El valor introducido no es valido";
		
		return str;
	}
	
}
