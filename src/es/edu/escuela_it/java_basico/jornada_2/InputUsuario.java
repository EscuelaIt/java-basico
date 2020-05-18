package es.edu.escuela_it.java_basico.jornada_2;

import java.util.Scanner;

public class InputUsuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hola, ingrese su nombre: ");

		String datoDelUsuario = sc.nextLine();
		
		System.out.println("ingrese su edad: ");

		int edad = sc.nextInt();
		
		boolean esMayorEdad = edad > 17;

		sc.close();

		System.out.println("Hola " + datoDelUsuario + ". Usted tiene " + edad + " años");
		
		System.out.println( "Es mayor de edad: " + esMayorEdad);

	}

}
