package examen2023.excepciones;

public class CodigoNegativoException extends Exception{
	
	@Override
	public String toString() {
		
		String str="";
		
		str+=super.toString()+"El valor no puede ser negativo";
		
		return str;
	}

	@Override
	public String getMessage() {

		String str="";
		
		str+=super.getMessage()+"El valor introducido no puede ser negativo";
		
		return str;
	}
	
}
