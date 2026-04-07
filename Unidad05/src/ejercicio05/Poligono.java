package ejercicio05;

public abstract class Poligono {
    protected int numeroLados;

    // Constructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Getter
    public int getNumeroLados() {
        return numeroLados;
    }

    // Método abstracto
    public abstract double area();

    @Override
    public String toString() {
        return "Número de lados: " + numeroLados;
    }
}

	

