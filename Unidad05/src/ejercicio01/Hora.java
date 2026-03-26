package ejercicio01;

public class Hora {

	 protected int hora;
	 protected int min; 
	
	// Constructor
	    public Hora(int hora, int minutos) {
	        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {
	            this.hora = hora;
	            this.min = minutos;
	        } else {
	            throw new IllegalArgumentException("Hora o minutos inválidos");
	        }
	    }

	    // Incrementa un minuto
	    public void inc() {
	    	min++;
	        if (min == 60) {
	        	min = 0;
	            hora++;
	            if (hora == 24) {
	                hora = 0;
	            }
	        }
	    }

	    // Setter de minutos
	    public boolean setMinutos(int valor) {
	        if (valor >= 0 && valor <= 59) {
	            this.min = valor;
	            return true;
	        }
	        return false;
	    }

	    // Setter de hora
	    public boolean setHora(int valor) {
	        if (valor >= 0 && valor <= 23) {
	            this.hora = valor;
	            return true;
	        }
	        return false;
	    }
	    
	    // Getters de hora
	    public int getHora() {
	        return hora;
	    }

	    // Getters de minutos
	    public int getMin() {
	        return min;
	    }


	    // Representación en String
	    @Override
	    public String toString() {
	        // Formato con dos dígitos en minutos
	        return String.format(hora + ":" + min);
	    }
	}