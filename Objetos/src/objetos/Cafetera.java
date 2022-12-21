package objetos;

public class Cafetera {

	// atributos
	private int capacidad;
	private int cantidad;
	private int cafesServidos;
	private int vecesRellenada;

	// constructor por defecto
	public Cafetera() {
		capacidad = 1000;
		cantidad = 0;
		cafesServidos = 0;
		vecesRellenada = 0;

	}

	// constructor con parametros

	public Cafetera(int capacidad, int cantidad) {
		this.capacidad = capacidad;
		this.cantidad = cantidad;
		cafesServidos = 0;
		vecesRellenada = 0;
	}

	// setters
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// getters
	public int getCantidad() {
		return cantidad;
	}

	

	public void LlenarCafetera() {
		cantidad = capacidad;

	}

	public void vaciarCafetera() {

		cantidad = 0;

	}

	public int servirTaza (int cantidadServir) {

		int cantidadRealmenteServida = cantidadServir;
		if (cantidadServir > cantidad) {
			cantidad = 0;

		}

		else {
			cantidad -= cantidadServir;

			cafesServidos++;

			return cantidadRealmenteServida;
		}

	}

	public void rellenar(int cantidad) {
		vecesRellenada++;

		this.cantidad += cantidad;

		if (this.cantidad > capacidad) {

			cantidad = capacidad;
		}

	}

	public void resetVecesRellenada() {
		vecesRellenada = 0;
	}

	public void resetCafesServidos() {
		cafesServidos = 0;


	}
	
	public void imprimir() {
		
		System.out.println(capacidad);
		System.out.println(cantidad);
		System.out.println(cafesServidos);
		System.out.println(vecesRellenada);
		
		}
	
	
	
	
	
	
}

