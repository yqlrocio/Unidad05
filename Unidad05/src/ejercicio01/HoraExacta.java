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
       boolean esValido = valor >= 0 && valor <= 59; 
       
       if (esValido) {
    	   this.seg = valor; 
       }
       
       return esValido;
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

    // String
    @Override
    public String toString() {
        return String.format(super.getHora() + ":" + super.getMin() + ":" + seg);
    }
}

