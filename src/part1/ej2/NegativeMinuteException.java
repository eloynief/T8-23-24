package part1.ej2;

public class NegativeMinuteException extends Exception{

	@Override
	public String toString() {
		String str="Minuto negativo";
		return str;
	}
	
}
