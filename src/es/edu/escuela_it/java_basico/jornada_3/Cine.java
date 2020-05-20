package es.edu.escuela_it.java_basico.jornada_3;

import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {

		boolean[][] filas = new boolean[4][6];

		Scanner sc = new Scanner(System.in);

		System.out.println("Reserve butaca, ingrese fila: ");
		int fila = sc.nextInt();

		System.out.println("ingrese butaca: ");
		int butaca = sc.nextInt();

		filas[fila][butaca] = true;

		for (int i = 0; i < filas.length; i++) {

			System.out.println("_________________________________");

			for (int j = 0; j < filas[i].length; j++) {

				String reservadaIcon = filas[i][j] ? "X" : "";

				System.out.print("[" + reservadaIcon + "]");

			}

			System.out.println();

		}

		sc.close();
	}

}
