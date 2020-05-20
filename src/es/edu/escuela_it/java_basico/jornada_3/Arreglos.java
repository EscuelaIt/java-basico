package es.edu.escuela_it.java_basico.jornada_3;

public class Arreglos {
	
	public static void main(String[] args) {
		
		//a. declarar
		int[] edades = new int[8];
		
		//b. Carga de datos
		edades[0] = 24;
		edades[1] = 34;
		edades[2] = 14;
		edades[3] = 44;
		edades[4] = 88;
		edades[5] = 82;
		edades[6] = 62;
		edades[7] = 25;
		
		System.out.println("dimension del array: " + edades.length );
		
		int menor = 10000;
		int viejo = -10000;
		float promedio = 0;
		
		//c. Recorrido para mostrarlo
		for (int i = 0; i < edades.length; i++) {
			
			if (edades[i] < menor) {
			
				menor = edades[i];
				
			}	
			
			if (edades[i] > viejo) {
				
				viejo = edades[i];
			}
				
			System.out.println(edades[i]);
			
			promedio += edades[i];
		}
		
		System.out.println("El mas joven tiene: " + menor);
		System.out.println("El mas viejo tiene: " + viejo);
		
		promedio /= edades.length;

		System.out.println("El promedio de edad es: " + promedio);
		
		int laCuartaEdad = edades[3];
		System.out.println("La cuarta persona tiene: " + laCuartaEdad + " años");
		
		
		
	
		
		for (int edad : edades) {
			
			if (edad>18)
			System.out.println(edad);
		
		}
		
		
	}

}
