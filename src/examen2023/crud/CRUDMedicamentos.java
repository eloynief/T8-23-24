package examen2023.crud;

import java.util.TreeSet;

import examen2023.Medicamento;
import examen2023.excepciones.ValorInvalidoException;
import examen2023.excepciones.ValorNegativoException;

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
     * delete
     * @param m
     * @return
     */
    public static boolean delete(String nombre) {
    	
    	boolean res=false;
    	
//    	Medicamento[] arrayMedicamentos=(Medicamento[]);
        
    	

        for (Medicamento med : coleccionMedicamentos) {
            if(med.getNombre().equalsIgnoreCase(nombre)) {
            	
            	coleccionMedicamentos.remove(med);
            	
            	res=true;
            }
        }
    			
        return res;
    }

    /**
     * modify
     * @param m
     * @return
     */
    public static boolean modifyMedicamento(Medicamento m) {
    	
    	boolean res=false;
    	
//    	Medicamento[] arrayMedicamentos=(Medicamento[]);
        
    	
    	
    	for (Medicamento med : coleccionMedicamentos) {
            if (med.equals(m)) {
            	
                med.setNombre(m.getNombre());
                med.setDesc(m.getDesc());
                
                try {
					med.setPrecio(m.getPrecio());
				} catch (ValorNegativoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
                try {
					med.setPosologia(m.getPosologia());
				} catch (ValorInvalidoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
                return true;
            }
        }
    	

        for (Medicamento med : coleccionMedicamentos) {
            if(med.equals(m)) {
            	
            	
            	
            	res=true;
            }
        }
    			
        return res;
    }
	
    
    
    
    
    
	
}
