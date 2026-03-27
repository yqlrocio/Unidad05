package ejercicio03;

public class Producto {
    
	protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // GETTERS Y SETTERS
    public String getNombre() { 
    	return nombre; 
    }
    
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    }

    public double getPrecio() { 
    	return precio; 
    }
    public void setPrecio(double precio) { 
    	this.precio = precio;
    }

    public double calcular(int cantidad) {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: " + precio;
    }
    
    // SUBCLASE PERECEDERO
    public class Perecedero extends Producto {
        private int diasACaducar;

        public Perecedero(String nombre, double precio, int diasACaducar) {
            super(nombre, precio);
            this.diasACaducar = diasACaducar;
        }

        public int getDiasACaducar() { 
        	return diasACaducar; 
        }
        
        public void setDiasACaducar(int diasACaducar) { 
        	this.diasACaducar = diasACaducar; 
        }

        @Override
        public double calcular(int cantidad) {
            double total = super.calcular(cantidad);
            double divisor = 1;

            if (diasACaducar == 1) {
                divisor = 4;
            } else if (diasACaducar == 2) {
                divisor = 3;
            } else if (diasACaducar == 3) {
                divisor = 2;
            }

            return total / divisor;
        }
        @Override
        public String toString() {
            return super.toString() + " | Días a caducar: " + diasACaducar;
        }
    }
    
    // SUBCLASE NO PERECEDERO
    public class NoPerecedero extends Producto {
        private String tipo;

        public NoPerecedero(String nombre, double precio, String tipo) {
            super(nombre, precio);
            this.tipo = tipo;
        }

        public String getTipo() { 
        	return tipo; 
        }
        
        public void setTipo(String tipo) { 
        	this.tipo = tipo; 
        }

        @Override
        public String toString() {
            return super.toString() + " | Tipo: " + tipo;
        }
    }
}