package objetos;

public class ObjetoArqueologico {
	
	

	//atributos
	private String nombre;
	private String material;
	private int anyo;
	private ubicacion ubicacion;
	
	
	

	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "ObjetoArqueologico [nombre=" + nombre + ", material=" + material + ", anyo=" + anyo + ", ubicacion="
				+ ubicacion + "]";
	}
	
	
	
	
	

}
