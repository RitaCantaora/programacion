package objetos;

public class ONG {

	private String nombre;
	private String sede;
	private String proyectos;
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getProyectos() {
		return proyectos;
	}
	public void setProyectos(String proyectos) {
		this.proyectos = proyectos;
	}
	
	
	
	@Override
	public String toString() {
		return "ONG [nombre=" + nombre + ", sede=" + sede + ", proyectos=" + proyectos + "]";
	}	

}
