package es.edu.escuela_it.java_basico.jornada_3;

public class Programa {

	public static void main(String[] args) {

		Estaciones[] estaciones = Estaciones.values();

		for (Estaciones est : estaciones) {
			
			if (est == Estaciones.VERANO) {
				
			}

			System.out.println(est);
		}

	}

}
