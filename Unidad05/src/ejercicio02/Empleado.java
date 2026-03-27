package ejercicio02;

public class Empleado {
	
	private String nombre; 
	
		// Constructor
		Empleado (String nombre) {
            this.nombre = nombre;
	    }

		// GETTERS
		public String getNombre() {
			return nombre;
		}

		//SETTERS
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

	    // String
	    @Override
	    public String toString() {
	        return "Empleado: " + nombre;
	    }
}

	// SUBCLASE DE EMPLEADO-> OPERARIO
	class Operario extends Empleado {
		 public Operario(String nombre) {
		        super(nombre);
		    }

		    @Override
		    public String toString() {
		    	return super.toString() + " -> Operario";
		    }
	}
	
	// SUBCLASE DE OPERARIO -> OFICIAL
	class Oficial extends Operario {
		public Oficial(String nombre) {
			super(nombre);
		}
		 @Override
		    public String toString() {
			  return super.toString() + " -> Oficial";
		    }
	}
	
	// SUBCLASE DE OPERARIO -> TECNICO
	class Tecnico extends Operario {
		public Tecnico(String nombre) {
	        super(nombre);
	    }

	    @Override
	    public String toString() {
	    	return super.toString() + " -> Técnico";
	    }
	}
	
	// SUBCLASE DE EMPLEADO-> DIRECTIVO
	class Directivo extends Empleado {
		public Directivo(String nombre) {
	        super(nombre);
	    }

	    @Override
	    public String toString() {
	    	return super.toString() + " -> Directivo";
	    }
	}
