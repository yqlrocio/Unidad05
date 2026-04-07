package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	    static ArrayList<Poligono> lista = new ArrayList<>();
	    static Scanner sc = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int opcion;

	        do {
	            mostrarMenu();
	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    introducirTriangulo();
	                    break;
	                case 2:
	                    introducirRectangulo();
	                    break;
	                case 3:
	                    mostrarPoligonos();
	                    break;
	                case 0:
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción no válida");
	            }

	        } while (opcion != 0);
	    }

	    // Función menú
	    public static void mostrarMenu() {
	        System.out.println("\n--- MENÚ ---");
	        System.out.println("1. Introducir triángulo");
	        System.out.println("2. Introducir rectángulo");
	        System.out.println("3. Mostrar polígonos");
	        System.out.println("0. Salir");
	        System.out.print("Seleccione una opción: ");
	    }

	    // Función opción 1
	    public static void introducirTriangulo() {
	        System.out.print("Introduce el lado 1 del triángulo: ");
	        double lado1 = sc.nextDouble();
	        System.out.print("Introduce el lado 2 del triángulo: ");
	        double lado2 = sc.nextDouble();
	        System.out.print("Introduce el lado 3 del triángulo: ");
	        double lado3 = sc.nextDouble();


	        Triangulo t = new Triangulo(lado1, lado2, lado3);
	        lista.add(t);

	        System.out.println("Triángulo añadido correctamente.");
	        System.out.println("Área = " + t.area());
	    }

	    // Función opción 2
	    public static void introducirRectangulo() {
	        System.out.print("Introduce el lado 1 del rectángulo: ");
	        double lado1 = sc.nextDouble();
	        System.out.print("Introduce el lado 2 del rectángulo: ");
	        double lado2 = sc.nextDouble();

	        Rectangulo r = new Rectangulo(lado1, lado2);
	        lista.add(r);

	        System.out.println("Rectángulo añadido correctamente.");
	        System.out.println("Área = " + r.area());
	    }

	    // Función opción 3
	    public static void mostrarPoligonos() {
	        if (lista.isEmpty()) {
	            System.out.println("No hay polígonos almacenados.");
	        } else {
	            System.out.println("\n--- LISTA DE POLÍGONOS ---");
	            for (Poligono p : lista) {
	                System.out.println(p);
	            }
	        }
	    }
	}