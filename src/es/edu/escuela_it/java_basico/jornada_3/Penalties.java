package es.edu.escuela_it.java_basico.jornada_3;

import java.util.Random;

public class Penalties {

	public static void main(String[] args) {

		String[] seleccionEsp = new String[] { "Iker", "Puyol", "Iniesta", "Ramos", "Villa.txt" };
		
		boolean[] penalties = new boolean[5];

		Random rnd = new Random();
		
		for (int i = 0; i < penalties.length; i++) {

			// Retornar 0 y 1
			int numero = rnd.nextInt(2);

			penalties[i] = numero == 0 ? false : true;
			
			System.out.println("Se prepara para patear.... " + seleccionEsp[i]);
			
			if (penalties[i])
			System.out.println("Gooooll");
			else
				System.out.println("Errro");
			
		}

	}

}
