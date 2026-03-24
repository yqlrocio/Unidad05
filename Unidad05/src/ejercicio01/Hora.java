package ejercicio01;

public class Hora {

	 protected int hora;
	 protected int min; 
	
	 Hora(int hora, int min) {
		this.hora = hora;
		this.min = min;
	 }

	 // GETTERS Y SETTERS
	 public int getHora() {
		 return hora;
	 }

	 public int getMin() {
		 return min;
	 }

	 public void setHora(int hora) {
		 if (hora >= 0 && hora <59) {
			 this.hora = hora;
		} else {
			System.out.println("Hora incorrecto");
		}
	}

	 public void setMin(int min) {
		if (min >= 0 && min <59) {
			 this.min = min;
		} else {
			System.out.println("Minuto incorrecto");
		}
	 }
	 
	 /**
	  * 
	  */
		
}
