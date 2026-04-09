package ejercicio_interfaz_03;

 public abstract class AnimalDomestico implements SerVivo {

	 public AnimalDomestico (String nombre, String raza, double peso, String color) {
		 this.nombre = nombre;
		 this.raza = raza;
		 this.peso = peso;
		 this.color = color;
	 }
	 
	// ATRIBUTOS
	 protected String nombre; 
	 protected String raza; 
	 protected double peso; 
	 protected String color;
	 
	 // GETTERS Y SETTERS
	 public String getNombre() {
		 return nombre;
	 }
	 public String getRaza() {
		 return raza;
	 }
	 public double getPeso() {
		 return peso;
	 }
	 public String getColor() {
		 return color;
	 }
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 public void setRaza(String raza) {
		 this.raza = raza;
	 }
	 public void setPeso(double peso) {
		 this.peso = peso;
	 }
	 public void setColor(String color) {
		 this.color = color;
	 } 
	 
	 @Override 
	 public void comer() {
		 System.out.println(nombre + "está durmiendo");
	 }
	 
	 @Override 
	 public void dormir() {
		 System.out.println(nombre + "está durmiendo");
	 }
	 
	 public void vacunar() {
		 System.out.println(nombre + "ha sido vacunado");
	 }
	 
	 public abstract boolean hacerCaso(); 
	 
	 @Override
	 public abstract boolean hacerRuido(); 

	 @Override
	 public String toString(); 
}
