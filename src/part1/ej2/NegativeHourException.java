package part1.ej2;

public class NegativeHourException extends Exception{

	@Override
	public String toString() {
		String str="Hora negativa";
		return str;
	}
	
}
