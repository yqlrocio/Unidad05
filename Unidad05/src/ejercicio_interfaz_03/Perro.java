package ejercicio_interfaz_03;

public class Perro extends AnimalDomestico{

	private static final double PROBABILIDAD_OBEDIENCIA = 0.05;
	
	public Perro (String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}
	
	@Override
	public void hacerRuido() {
		System.out.println(getNombre() + "dice ¡Guau!");
	}
	
	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA; 
	}
	
	public void toserBolaPelo() {
		System.out.println(getNombre() + "está tosinedo pelo");
	}
}


