package es.edu.escuela_it.java_basico.jornada_3;

import java.util.Scanner;

public class ArrayMas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] seleccionEsp = new String[] { "Iker", "Puyol", "Iniesta", "Ramos", "Villa.txt" };
		
		System.out.println("Seleccion campeona de España Sudafrica 2010");

		for (String nombreJugador : seleccionEsp) {
			System.out.println(nombreJugador);
		}
		
		System.out.println("Ingrese el nombre de un jugador: ");
		
		String search = sc.nextLine();
		
		for (String nombreJugador : seleccionEsp) {
			
			search = search.toLowerCase();
			
			nombreJugador = nombreJugador.toLowerCase();
			
			if (nombreJugador.contains(search)) {
				
				System.out.println("Jugador encontrado: " + nombreJugador + " !!!");
			}
			
		}
		
		

		sc.close();

	}

}
