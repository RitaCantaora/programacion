package objetos;

public class ubicacion {
	
	//atributos
	private	int sala;
	private	int piso;
	
	
	
	
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	
	
	@Override
	public String toString() {
		return "ubicacion [sala=" + sala + ", piso=" + piso + "]";
	}
		

}
