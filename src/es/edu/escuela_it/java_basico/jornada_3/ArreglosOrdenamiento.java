package es.edu.escuela_it.java_basico.jornada_3;

import java.util.Arrays;

public class ArreglosOrdenamiento {

	public static void main(String[] args) {

		// a. declarar
		int[] edades = new int[8];

		// b. Carga de datos
		edades[0] = 24;
		edades[1] = 34;
		edades[2] = 14;
		edades[3] = 44;
		edades[4] = 88;
		edades[5] = 82;
		edades[6] = 62;
		edades[7] = 25;

		for (int i = 0; i < edades.length; i++) {

			for (int j = 0; j < edades.length; j++) {

				if (edades[i] < edades[j]) {

					// Intercambio
					int aux = edades[i];
					edades[i] = edades[j];
					edades[j] = aux;

				}

			}
		}
		
		//Arrays.sort(edades);
		
		for (int edad : edades) {
			System.out.println("Edad: " + edad);
		}

	}

}
