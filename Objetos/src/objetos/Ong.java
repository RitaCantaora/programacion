package objetos;

public class Ong {
	
	//atributos

	private String nombre;
	private String proyectos;
	private String ceo;
	private double presupuesto1;
	private Sede sede1;
	private Sede sede2;
	private Sede sede3;

	// SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setProyectos(String proyectos) {
		this.proyectos = proyectos;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public void setPresupuesto1(float presupuesto1) {
		this.presupuesto1 = presupuesto1;
	}

	public void setSede1(Sede sede1) {
		this.sede1 = sede1;
	}

	public void setSede2(Sede sede2) {
		this.sede2 = sede2;
	}

	public void setSede3(Sede sede3) {
		this.sede3 = sede3;
	}

	// GETTERS
	public String getNombre() {
		return nombre;
	}

	public String getProyectos() {
		return proyectos;
	}

	public String getCeo() {
		return ceo;
	}

	public double getPresupues1() {
		return presupuesto1;
	}

	public Sede getSede1() {
		return sede1;
	}

	public Sede getSede2() {
		return sede2;
	}

	public Sede getSede3() {
		return sede3;
	}

	@Override
	public String toString() {
		return "Ong [nombre=" + nombre + ", proyectos=" + proyectos + ", sede1=" + sede1 + ", sede2=" + sede2
				+ ", sede3=" + sede3 + "]";
	}

}
