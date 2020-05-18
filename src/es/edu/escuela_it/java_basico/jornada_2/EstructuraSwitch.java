package es.edu.escuela_it.java_basico.jornada_2;

import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcion = -1;

		while (opcion != 4) {
			
			System.out.println("Bienvenidos al sistema");
			System.out.println("1. ABM Usuarios");
			System.out.println("2. ABM Clientes");
			System.out.println("3. ABM Operaciones");
			System.out.println("4. Salir");
			System.out.println("_________________");
			System.out.println("Ingrese una opcion: ");
			opcion = sc.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("Bienvenidos a  ABM usuarios");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;

			case 2:
				System.out.println("Bienvenidos a  ABM clientes");
				break;
			case 3:
				System.out.println("Bienvenidos a  ABM operaciones");
				break;
			case 4:
				System.out.println("Saliendo del sistema");
				break;

			}
		}
		sc.close();
	}

}
