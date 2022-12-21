package objetos;

public class Proyectos {
	
	
	
	private String Poblacion ;
	private int numHabitantes;
	private int identificador ;
	private int inversion ;
	
	
	
	public String getPoblacion() {
		return Poblacion;
	}
	public void setPoblacion(String poblacion) {
		Poblacion = poblacion;
	}
	public int getNumHabitantes() {
		return numHabitantes;
	}
	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getInversion() {
		return inversion;
	}
	public void setInversion(int inversion) {
		this.inversion = inversion;
	}
	@Override
	public String toString() {
		return "Proyectos [Poblacion=" + Poblacion + ", numHabitantes=" + numHabitantes + ", identificador="
				+ identificador + ", inversion=" + inversion + "]";
	}

}




