package objetos;

public class Sedes {
	
	
	private String ciudad;
	private String Pais;
	private String director;
	
	
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	private int Telefono;



	@Override
	public String toString() {
		return "Sedes [ciudad=" + ciudad + ", Pais=" + Pais + ", director=" + director + ", Telefono=" + Telefono + "]";
	}
	
	
	
}
