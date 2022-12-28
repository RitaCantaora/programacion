package Robot;

import java.util.Random;

public class Robot {

	// Atributos

	private String nombre;
	private int puntos;
	private int ataque;
	private int defensa;

	// constucto con parametros

	public Robot(String nombre) {

		this.nombre = nombre;
		this.puntos = 100;
		GenerarAtaque();
		GenerarDefensa();
		
		

	}

	// metodos

	private void GenerarAtaque() {

			Random r = new Random();
			
				this.ataque = r.nextInt(20);
	}
				
	private void GenerarDefensa() {

					Random r = new Random();
					
						this.defensa = r.nextInt(100);
						
	}			
		
		//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {

		if (ataque >= 0 && ataque <= 20) {

			this.ataque = ataque;
		}

	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;

		// to String
	}

	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", puntos=" + puntos + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", getNombre()=" + getNombre() + ", getPuntos()=" + getPuntos() + ", getAtaque()=" + getAtaque()
				+ ", getDefensa()=" + getDefensa() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
