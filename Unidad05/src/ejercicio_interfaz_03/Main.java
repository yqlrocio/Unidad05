package ejercicio_interfaz_03;

public class Main {

	public static void main(String[] args) {

		Perro perro = new Perro("Rex", "Pastor Alemán", 30.5, "marrón"); 
		Gato gato = new Gato("Ulises", "Siamés", 4.5, "blanco");
		
		mostrarPerro(perro); 
		mostrarPerro(gato); 
		demostrarPolimorfismoAnimal(new Animal[] {perro, gato});
		demostrarPolimorfismoAnimalDomestico(new AnimalDomestico[] {perro, gato});
	
	}
	
	private static void mostrarPerro(Perro perro) {
		System.out.println("====PERRO====");
		System.out.println(perro);
		perro.comer();
		perro.dormir();
		perro.hacerRuido();
		imprimirObediencia(perro.getNombre(), perro.hacerCaso()); 
		perro.vacunar();
		perro.sacaPaseo(); 
		System.out.println();
	}
	
	private static void mostrarGato(Gato gato) {
		System.out.println("====GATO====");
		System.out.println(gato);
		gato.comer();
		gato.dormir();
		gato.hacerRuido();
		imprimirObediencia(gato.getNombre(), gato.hacerCaso()); 
		gato.vacunar();
		gato.sacaPaseo(); 
		System.out.println();
	}

	private static void imprimirObediencia(String nombre, boolean obedece) {
		System.out.println(nombre + (obedece ? "hace caso" : "no hace caso"));
	}
	
	private static void demostrarPolimorfidmoVivir(Vivir[] animales) {
		System.out.println("====POLIMORFISMO VIVIR[]====");
		for ()
	}
}
