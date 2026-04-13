package ejercicioInterfaz02;

public class Futbolista {

	// ATRIBUTOS
		protected int numCamiseta; 
		protected String nombre; 
		protected int edad;
		protected int numGol; 
		
	// CONSTRUCTOR 
	public Futbolista(int numCamiseta, String nombre, int edad, int numGol) {
		super();
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGol = numGol;
	}
	
	public String toString() {
		return "El/La futbolista " + nombre + " de numero " + numCamiseta + ", con " + edad + " años, ha marcado " + numGol + " goles \n";  	}
	
	public boolean equals(Object obj) {
		boolean mismoFutbolista = false;
		
		//Casteo
		Futbolista otroFutbolista = (Futbolista) obj;
		
		//Dos futbolistas son iguales si tienen mismo numero de camiseta y nombre
		if (this.nombre.equalsIgnoreCase(otroFutbolista.nombre) && this.numCamiseta == otroFutbolista.numCamiseta) {
			mismoFutbolista = true;
		}
		
		return mismoFutbolista;
	}
	
	public int compareTo(Object objeto) {
		int resultado;
		
		//Casteo
		Futbolista fut = (Futbolista) objeto;
		
		//Primero se considerara si tienen el mismo numeroCamiseta y, si es asi, entonces se comprobara si tambien tienen el mismo nombre
		if (this.numCamiseta < fut.numCamiseta) {
			resultado = -1;
		} else if (this.numCamiseta > fut.numCamiseta) {
			resultado = 1;
		} else {
			resultado = this.nombre.compareToIgnoreCase(fut.nombre);
		}
		
		return resultado;
	}
}
	

