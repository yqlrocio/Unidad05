package ejercicioInterfaz02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Futbolista tablaFutbolistas[] = new Futbolista[] {
				new Futbolista(17, "Alfonso", 24, 6),
				new Futbolista(8, "Rocío", 18, 5),
				new Futbolista(25, "Carla", 5, 6),
				new Futbolista(17, "Chencho", 18, 5),
				new Futbolista(29, "Hugo", 10, 13)
		};
		
		Arrays.sort(tablaFutbolistas);
		
		System.out.println(Arrays.deepToString(tablaFutbolistas));

	}

}