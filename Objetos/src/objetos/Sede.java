package objetos;

public class Sede {
	
	//atributos
	
	private String ciudad;
	private String pais;
	private String direccion;
	private String nombreDirecctor;
	private String telefono;
	private float presupuesto;
	private Proyecto proyecto1;
	private Proyecto proyecto2;
	private Proyecto proyecto3;

	// SETTERS

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNombreDirecctor(String nombreDirecctor) {
		this.nombreDirecctor = nombreDirecctor;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}

	public void setProyecto1(Proyecto proyecto1) {
		this.proyecto1 = proyecto1;
	}

	public void setProyecto2(Proyecto proyecto2) {
		this.proyecto2 = proyecto2;
	}

	public void setProyecto3(Proyecto proyecto3) {
		this.proyecto3 = proyecto3;
	}

	// GETTERS
	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombreDirecctor() {
		return nombreDirecctor;
	}

	public String getTelefono() {
		return telefono;
	}

	public float getPresupuesto() {
		return presupuesto;
	}

	public Proyecto getProyecto1() {
		return proyecto1;
	}

	public Proyecto getProyecto2() {
		return proyecto2;
	}

	public Proyecto getProyecto3() {
		return proyecto3;
	}
	// TO STRING

	@Override
	public String toString() {
		return "Sede [ciudad=" + ciudad + ", pais=" + pais + ", direccion=" + direccion + ", nombreDirecctor="
				+ nombreDirecctor + ", telefono=" + telefono + ", presupuesto=" + presupuesto + ", proyecto1="
				+ proyecto1 + ", proyecto2=" + proyecto2 + ", proyecto3=" + proyecto3 + "]";
	}

}
