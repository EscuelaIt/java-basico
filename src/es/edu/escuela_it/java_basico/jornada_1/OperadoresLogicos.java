package es.edu.escuela_it.java_basico.jornada_1;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean tengoDinero = true;
		
		boolean juegaMiEquipoFavorito = false;
		
		boolean esLindoDia = true;
		
		boolean asistirAPartido = tengoDinero &&  esLindoDia || juegaMiEquipoFavorito;
		
		System.out.println(asistirAPartido);
		
		
	}

}
