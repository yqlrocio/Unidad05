package ejercicio04;

public class Electrodomestico {

	protected double precioBase; 
	protected String color; 
	protected char consumoEnergetico; 
	protected double peso; 
	
	 // Valores por defecto
    private final static String COLOR_DEF = "blanco";
    private final static char CONSUMO_DEF = 'F';
    private final static double PRECIO_DEF = 100;
    private final static double PESO_DEF = 5;

    // Constructores
    public Electrodomestico() {
        this.precioBase = PRECIO_DEF;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_DEF;
        this.peso = PESO_DEF;
    }

    public Electrodomestico(double precioBase, double peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // Métodos privados de comprobación
    private char comprobarConsumoEnergetico(char letra) {
        char[] letras = {'A','B','C','D','E','F'};
        for (char l : letras) {
            if (l == Character.toUpperCase(letra)) {
                return l;
            }
        }
        return CONSUMO_DEF;
    }

    private String comprobarColor(String color) {
        String[] colores = {"blanco","negro","rojo","azul","gris"};
        for (String c : colores) {
            if (c.equalsIgnoreCase(color)) {
                return c;
            }
        }
        return COLOR_DEF;
    }

    // Método precioFinal
    public double precioFinal() {
        double extra = 0;

        // Consumo energético
        switch (consumoEnergetico) {
            case 'A': extra += 100; break;
            case 'B': extra += 80; break;
            case 'C': extra += 60; break;
            case 'D': extra += 50; break;
            case 'E': extra += 30; break;
            case 'F': extra += 10; break;
        }

        // Peso
        if (peso < 20) extra += 10;
        else if (peso < 50) extra += 50;
        else if (peso < 80) extra += 80;
        else extra += 100;

        return precioBase + extra;
    }
}