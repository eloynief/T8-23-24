package examen2023;

import examen2023.excepciones.ValorInvalidoException;
import examen2023.excepciones.ValorNegativoException;

/**
 * clase con atributos getterssetters constructors etc 
 * Tiene comparable compareTo
 * Exceptions ValorNegativoException ValorInvalidoException
 */
public class Medicamento implements Comparable<Medicamento>{
		
		
	  	private int codigo;
	  	private String nombre;
	    private String desc;
	    private double precio;
	    private String posologia;

	    // Constructores
	    public Medicamento() {}

	    public Medicamento(int codigo) throws ValorNegativoException{
	        this.codigo = codigo;
	    }

	    public Medicamento(int codigo, String nombre, String desc) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.desc = desc;
	    }

	    public Medicamento(int codigo, String nombre, String desc, double precio, String posologia) throws ValorInvalidoException{
	        
	    	this.codigo = codigo;
	        
	    	if(nombre!=null&&!nombre.equals("")) {
	    		this.nombre = nombre;
	    	} else {
	    		throw new ValorInvalidoException();
	    	}

	    	
	    	if(desc!=null&&!desc.equals("")) {
	    		this.desc = desc;
	    	} else {
	    		throw new ValorInvalidoException();
	    	}

	    	
			if(precio>=0) {
				    		
				this.precio = precio;
			} else {
	    		throw new ValorInvalidoException();
	    	}

	    	if(posologia!=null&&!posologia.equals("")) {
	    		this.posologia = posologia;
	    	} else {
	    		throw new ValorInvalidoException();
	    	}

	        
	    }

	    // Getters
	    public int getCodigo() {
	        return codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getDesc() {
	        return desc;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public String getPosologia() {
	        return posologia;
	    }

	    // Setters
	    public void setNombre(String nombre) {
	    	if(nombre!=null&&!nombre.equals("")) this.nombre = nombre;
	    }

	    public void setDesc(String desc) {
	    	if(desc!=null&&!desc.equals("")) this.desc = desc;
	    }

	    public void setPrecio(double precio) throws ValorNegativoException {
	    	if(precio>=0) {
	    		
		        this.precio = precio;
	    	}else {
	    		throw new ValorNegativoException();
	    	}
	    }

	    public void setPosologia(String posologia) throws ValorInvalidoException {
	    	
	    	if(posologia!=null&&!posologia.equals("")) {
	    		this.posologia = posologia;
	    	} else {
	    		throw new ValorInvalidoException();
	    	}
	    	
	    }

	    
	    
	    @Override
	    public String toString() {
	    	
	    	String str="";
	    	
	    	str+="codigo:" + codigo+"\n";
	    	str+="nombre:" + nombre+"\n";
	    	str+="desc:" + desc+"\n";
	    	str+="precio:" + precio+"\n";
	    	str+="posologia:" + posologia+"\n";
	        return str;
	    }

	    @Override
	    public boolean equals(Object o) {
			boolean comprobacion=false;
			
	    	Medicamento m=(Medicamento)o;
	    	
	    	if(m.codigo==this.codigo&&m.nombre.equals(this.nombre)) {
	    		comprobacion=true;
	    	}
	    	
	        return comprobacion;
	    }
	    

		@Override
		public int compareTo(Medicamento o) {
			
			//se crea una var cuyo valor es 0
			int var=0;

//			if(this.codigo<o.codigo) {
//				var=-1;
//			}
			
			//directamente se calcula todo
			var=this.codigo-o.codigo;
			
			if(var==0) {
				var=this.nombre.compareTo(o.nombre);
			}
			
			return var;
		}
	    

}
