package ejercicio01;


public class HoraExacta extends Hora {

	protected int seg;

    // Constructor
    HoraExacta(int hora, int min, int seg) {
        super(hora, min); // llama al constructor de la superclase Hora
        setSegundo(seg);
        
    }

    // Setter de segundos
    public boolean setSegundo(int valor) {
        if (valor >= 0 && valor <= 59) {
            this.seg = valor;
            return true;
        }
        return false;
    }

    // Incrementa un segundo
    @Override
    public void inc() {
    	
    	seg++;
        if (seg == 60) {
        	seg = 0;
            super.inc(); // usa el método inc() de la superclase Hora
        }
    }

    // Representación en String
    @Override
    public String toString() {
        return String.format(super.getHora() + ":" + super.getMin() + ":" + seg);
    }
}

