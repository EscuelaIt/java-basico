package es.edu.escuela_it.java_basico.jornada_4;

public class Pais {

	private String nombre;

	private String bandera;

	private String idioma;

	private int poblacion;

	private boolean isUe;

	private String iso;

	private Ciudad capital;

	private Ciudad[] ciudadesImportantes;

	private Continente continente;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBandera() {
		return bandera;
	}

	public void setBandera(String bandera) {
		this.bandera = bandera;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	public boolean isUe() {
		return isUe;
	}

	public void setUe(boolean isUe) {
		this.isUe = isUe;
	}

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public Ciudad getCapital() {
		return capital;
	}

	public void setCapital(Ciudad capital) {
		this.capital = capital;
	}

	public Ciudad[] getCiudadesImportantes() {
		return ciudadesImportantes;
	}

	public void setCiudadesImportantes(Ciudad[] ciudadesImportantes) {
		this.ciudadesImportantes = ciudadesImportantes;
	}

}
