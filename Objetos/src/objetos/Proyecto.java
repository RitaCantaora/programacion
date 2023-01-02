package objetos;

public class Proyecto {
	// ATRIBUTOS
	private String poblacion;
	private String pais;
	private float numeroHabitantes;
	private String identificador;
	private double importeInversion;

	// SETTERS
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public void setPais(String pais) {
		this.pais = pais;

	}

	public void setnumeroHabitantes(float numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;

	}

	public void setidentificador(String identificador) {
		this.identificador = identificador;

	}

	public void setimporteInversion(double importeInversion) {
		this.importeInversion = importeInversion;

	}

	// GETTERS

	public String getPoblacion() {
		return poblacion;
	}

	public String getPais() {
		return pais;
	}

	public float getnumeroHabitantes() {
		return numeroHabitantes;
	}

	public String getidentificador() {
		return identificador;
	}

	public double getimporteInversion() {
		return importeInversion;
	}
	
//TO STRING
	@Override
	public String toString() {
		return "Proyecto [poblacion=" + poblacion + ", pais=" + pais + ", numeroHabitantes=" + numeroHabitantes
				+ ", identificador=" + identificador + ", importeInversion=" + importeInversion + "]";
	}

}
