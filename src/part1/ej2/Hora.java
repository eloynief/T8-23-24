package part1.ej2;

public class Hora {
	
	protected int hora;
	
	protected int minuto;
	
	
	
	
	
	public Hora() {
	}





	public Hora(int hora, int minuto) {
		if (hora>=0&&hora<24) {
			this.hora = hora;
		}
		
		if(minuto>=0&&minuto<60) {
			this.minuto = minuto;
		}
		
	}





	public int getHora() {
		return hora;
	}





	public void setHora(int hora) throws NegativeHourException{
		if (hora>=0&&hora<24) {
			this.hora = hora;
		}
		else {
			throw new NegativeHourException();
		}
	}





	public int getMinuto() {
		return minuto;
	}





	public void setMinuto(int minuto) throws NegativeMinuteException{
		if(minuto>=0&&minuto<60) {
			this.minuto = minuto;
		}
		else {
			throw new NegativeMinuteException();
		}
		
	}





	void inc() {
		this.minuto++;
		while(minuto>59) {
			this.hora++;
			minuto-=60;
			
			if(hora>23) {
				hora-=24;
			}
		}
	}





	@Override
	public String toString() {
		String str="";
		if(hora<10) {

			str+="Hora: 0"+hora+"\n";
		}
		else {

			str+="Hora: "+hora+"\n";
		}
		
		if(minuto<10) {

			str+="Minuto: 0"+minuto+"\n";
		}
		else {
			str+="Minuto: "+minuto+"\n";
		}
		
		return str;
	}
	
	
	
	
}
