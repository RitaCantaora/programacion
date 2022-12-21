package objetos;

public class Termometro {

	// Atributos
	private String localidad;
	private float temperatura;
	private float temperaturaMax;
	private float temperaturaMin;
	private boolean celsius;

	// Constructor por defecto.es que no recibe parametros yo decido que parametros
	// tienen los atributos
	public Termometro() {

		temperatura = 10;
		temperaturaMax = -1000;
		temperaturaMin = 1000;
		localidad = " ";
		celsius = true;
	}

	// Constructor parametrizado.que recibe parametros
	public Termometro(String localidad, float temperatura) {

		this.localidad = localidad;
		this.temperatura = temperatura;
		celsius = true;
		temperaturaMax = temperatura;
		temperaturaMin = temperatura;
	}

	// geters
	// get pide y return devuelve y la clase public debe ser con la variable q
	// estamos usando en el atributo que estamos pidiendo

	public float getTemperatura() {

		return temperatura;

	}

	public String getlocalidad() {

		return localidad;

	}

//seters(no devulven nada )
	public void setTemperatura(float temperatura) {

		this.temperatura = temperatura;

		if (temperatura > temperaturaMax) {

			temperaturaMax = temperatura;
		}

		if (temperatura < temperaturaMin) {

			temperaturaMin = temperatura;
		}
	}

	public void setLocalidad(String localidad) {

		this.localidad = localidad;
	}

	public void setCelsius(boolean celsius) {

		this.celsius = celsius;

		// Me mandan cambiarme a celsius o farenheit en función de en lo que estoy.

		if (this.celsius != celsius) {

			if (celsius) {

				// actualizo la temperatura a celsius.
				temperatura = (temperatura - 32) * 5 / 9;
			}

			else {

				// tengo que cambiar a farenheit.
				temperatura = (temperatura * 9 / 5) + 32;
			}

			this.celsius = celsius;
		}

	}

	public void imprimirTermometro() {

		System.out.println("Voy a imprimir termometro de :" + localidad);
		System.out.println("Voy a imprimir termometro de :" + temperatura);
	}
}
