package objetos;

public class Museo {
	
	//atributos
	
	private String nombre;
	private String ubicacion;
	private int tamanyo ;
	private Coleccion permanente;
	private Coleccion itinerante;
	
	
	
	//getters y setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getTamanio() {
		return tamanyo;
	}
	public void setTamanio(int tamanio) {
		this.tamanyo = tamanio;
	}
	public Coleccion getPermanente() {
		return permanente;
	}
	public void setPermanente(Coleccion permanente) {
		this.permanente = permanente;
	}
	public Coleccion getItinerante() {
		return itinerante;
	}
	public void setItinerante(Coleccion itinerante) {
		this.itinerante = itinerante;
	}
	
	//to string
	
	@Override
	public String toString() {
		return "Museo [nombre=" + nombre + ", ubicacion=" + ubicacion + ", tamanyo=" + tamanyo + ", permanente="
				+ permanente + ", itinerante=" + itinerante + "]";
	}
	
	
	
	

	
	
	
}
