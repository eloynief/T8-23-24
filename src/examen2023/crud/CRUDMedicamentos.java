package examen2023.crud;

import examen2023.Medicamento;

public class CRUDMedicamentos {
	
	
	public static TreeSet<Medicamento> coleccionMedicamentos = new TreeSet<>();

    public static void listarMedicamento() {
        for (Medicamento medicamento : coleccionMedicamentos) {
            System.out.println(medicamento);
        }
    }
    
    

    public static boolean modifyMedicamento() {
    	
    	boolean res=false;
    	
//    	Medicamento[] arrayMedicamentos=(Medicamento[]);
        
    	

        for (Medicamento medicamento : coleccionMedicamentos) {
            if(medicamento.equals()) {
            	res=true;
            }
        }
    			
    			
    			
        return res;
    }
	
	
	
}
