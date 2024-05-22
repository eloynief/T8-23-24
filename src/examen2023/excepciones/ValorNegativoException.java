package examen2023.excepciones;

public class ValorNegativoException extends Exception {

	@Override
	public String toString() {
		
		String str="";
		
		str+=super.toString()+"El valor no puede ser negativo";
		
		return str;
	}
	
	
}
