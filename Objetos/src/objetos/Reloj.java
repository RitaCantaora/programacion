package objetos;

public class Reloj {

	// atributos
	private int horas;
	private int minutos;
	private int segundos;

	// constructores con parametros q en realidad es el setter

	public Reloj(int horas, int minutos, int segundos) {
		setHoras(horas, minutos, segundos);
	}

	// constructor copia
	public Reloj(Reloj original) {

		this.horas = original.horas;
		this.minutos = original.minutos;
		this.segundos = original.segundos;

	}

	// setters son para dar un valor al  constructor "por defecto "esto hace fortalecer el
	// codigo ya q no pueden darme valores q no estan en el setter (no pueden darme mas de 60miutos ni de 24 horas,x ejemplo)
	// los set cambian los valores de los atributos
	// si hago un constructor con parametros con el set cambio algun atributo pero
	// no todos o si pero yo decido
	// y si hago constructor sin parametros con el set cambio todos los atributos

	public void setHoras(int horas, int minutos, int segundos) {
		if ((segundos >= 0) && (segundos < 60) && (minutos >= 0) && (minutos <= 60) && (horas >= 0) && (horas < 24)) {

			this.segundos = segundos;
			this.minutos = minutos;
			this.horas = horas;

		}
	}

	// getters recibir un valor
	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;

	}

	public int getSegundos() {
		return segundos;
	}
	/*
	 * esta operación va a añadir 1s a this y esa hora colocarla en un nuevo reloj
	 * que vamos a devolver
	 */

	public Reloj addSegundos() {

		Reloj devolver = new Reloj(this);
		// copiamos los parametros del constructor copia para hacer el reloj devolver
	
		devolver.segundos++;
		if (devolver.segundos == 60) {

			devolver.minutos++;
			devolver.segundos = 0;

			if (devolver.minutos == 60) {
				devolver.minutos = 0;
				devolver.horas++;

				if (devolver.horas == 24) {
					devolver.horas = 0;

				}
			}
		}

		return devolver;

	}

	public Reloj sumar(Reloj sumar) {

		Reloj devolver = new Reloj(this);
		devolver.segundos+=sumar.segundos;
		if (devolver.segundos >= 60) {
			devolver.segundos=devolver.segundos-60;
			devolver.minutos ++ ;

			if (devolver.minutos >=60) {
				devolver.minutos =60-sumar.minutos;
				devolver.horas++;

				if (devolver.horas == 24) {
					devolver.horas = 0;

				}
			}
		}
		return devolver;
	}

	/*public void imprimir() {

		System.out.println("hora: " + horas);
		System.out.println("minutos:" + minutos);
		System.out.println("segundos: " + segundos);

	}
	*/
	public String toString () {
		//con el to String le decimos que nos imprima los atributos de la clase 
		//\n es retorno de carro 
		//"\" para imprimir entre comillas
		
		return"\""+horas+":"+minutos+":"+segundos+"\"";
	}
	
	
	
	
}
