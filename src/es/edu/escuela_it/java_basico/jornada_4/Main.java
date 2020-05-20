package es.edu.escuela_it.java_basico.jornada_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pais miPais = new Pais();

		System.out.println("Ingrese pais: ");
		miPais.setNombre(sc.nextLine());

		System.out.println("Ingrese bander: ");
		miPais.setBandera(sc.nextLine());

		System.out.println("Ingrese idioma: ");
		miPais.setIdioma(sc.nextLine());

		System.out.println("Poblacion: ");
		miPais.setPoblacion(sc.nextInt());

		miPais.setContinente(Continente.EUROPA);
		
		
		Ciudad c0 = new Ciudad();
		c0.setNombre("Madrid");
		c0.setPatrono("San Isidro");
		c0.setPresupuesto(1_000_000_000);
		
		Ciudad c1 = new Ciudad();
		c1.setNombre("Barcelona");
		c1.setPatrono("San Jordi");
		c1.setPresupuesto(2_000_000_000);
		
		Ciudad c2 = new Ciudad();
		c2.setNombre("Valencia");
		c2.setPatrono("Virgen de los desamparados");
		c2.setPresupuesto(1_000_000_000);
		
		
		Ciudad[] ciudades = new Ciudad[3];
		ciudades[0] = c0;
		ciudades[1] = c1;
		ciudades[2] = c2;
		
		miPais.setCiudadesImportantes(ciudades);
		
		
		miPais.setCapital(c0);

		String pais = miPais.getNombre();

		System.out.println("Pais: " + pais);
		
		//ctrl + shift + 2 + l
		Ciudad[] ciudadesImporantes = miPais.getCiudadesImportantes();
		
		for (Ciudad ciudad : ciudadesImporantes) {
			
			System.out.println(ciudad.getNombre());
		}

		sc.close();

	}

}
