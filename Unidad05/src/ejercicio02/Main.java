package ejercicio02;

public class Main {

	public static void main(String[] args) {
        Empleado[] empleados = {
            new Empleado("Rafa"),
            new Directivo("Mario"),
            new Operario("Alfonso"),
            new Oficial("Luis"),
            new Tecnico("Pablo")
        };

        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}