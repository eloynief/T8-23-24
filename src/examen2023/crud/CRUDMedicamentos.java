package examen2023.crud;

import java.util.TreeSet;

import examen2023.Medicamento;

public class CRUDMedicamentos {
	
	/*
	 * atributo que guardara la coleccion de los medicamentos en un TreeSet
	 */
	public static TreeSet<Medicamento> coleccionMedicamentos = new TreeSet<>();

    public static void listar() {
        for (Medicamento med : coleccionMedicamentos) {
            System.out.println(med);
        }
    }
    
    public static boolean add(Medicamento m) {
    	
    	boolean res=false;
    	
    	
    	if(!coleccionMedicamentos.contains(m)) {
        	
        	coleccionMedicamentos.add(m);
        	
        	res=true;
        }

//        for (Medicamento med : coleccionMedicamentos) {
//            
//        }
    			
    			
    			
        return res;
    	
    }
    
    
    /**
     * 
     * @param m
     * @return
     */
    public static boolean delete(Medicamento m) {
    	
    	boolean res=false;
    	
//    	Medicamento[] arrayMedicamentos=(Medicamento[]);
        
    	

        for (Medicamento med : coleccionMedicamentos) {
            if(med.equals(m)) {
            	
            	
            	
            	res=true;
            }
        }
    			
        return res;
    }

    /**
     * 
     * @param m
     * @return
     */
    public static boolean modifyMedicamento(Medicamento m) {
    	
    	boolean res=false;
    	
//    	Medicamento[] arrayMedicamentos=(Medicamento[]);
        
    	

        for (Medicamento med : coleccionMedicamentos) {
            if(med.equals(m)) {
            	
            	
            	
            	res=true;
            }
        }
    			
        return res;
    }
	
    
    
    
    
    
	
}
