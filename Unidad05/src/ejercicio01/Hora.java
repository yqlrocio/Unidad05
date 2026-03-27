package ejercicio01;

public class Hora {

	 protected int hora;
	 protected int min; 
	
	// Constructor
	 Hora(int hora, int min) {
	        if (hora >= 0 && hora <= 23 && min >= 0 && min <= 59) {
	            this.hora = hora;
	            this.min = min;
	        } else {
	            System.out.println("Hora o minutos inválidos");
	        }
	    }

	    // Incrementa un minuto/hora
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
	        boolean esValido = valor >= 0 && valor <= 59;

	        if (esValido) {
	            this.min = valor;
	        }

	        return esValido;
	    }

	    // Setter de hora
	    public boolean setHora(int valor) {
	       boolean esValido = valor >=0 && valor <= 59; 
	       
	       if (esValido) {
	    	   this.hora = valor; 
	       }
	       
	       	return esValido;
	    }
	    	
	    
	    // Getters de hora
	    public int getHora() {
	        return hora;
	    }

	    // Getters de minutos
	    public int getMin() {
	        return min;
	    }


	    // String
	    @Override
	    public String toString() {
	        // Formato con dos dígitos en minutos
	        return String.format(hora + ":" + min);
	    }
	}