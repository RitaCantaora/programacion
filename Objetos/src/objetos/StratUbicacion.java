package objetos;

public class StratUbicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ubicacion almacen= new ubicacion();	
	
	almacen.setPiso(-1);
	almacen.setSala(0);
	
	
	ObjetoArqueologico espadaMedieval= new ObjetoArqueologico();
	espadaMedieval.setNombre("espada de Williams Wallacer");
	espadaMedieval.setMaterial("hierro");
	espadaMedieval.setAnyo(1047);
	espadaMedieval.setUbicacion(almacen);
	System.out.println("espadaMedieval"+espadaMedieval.toString());
		
		
	ObjetoArqueologico ArmaduraMedieval= new ObjetoArqueologico();
	 ArmaduraMedieval.setNombre("armadura");
	 ArmaduraMedieval.setMaterial("hierro");
	 ArmaduraMedieval.setAnyo(1500);
	 ArmaduraMedieval.setUbicacion(almacen);
	 
	System.out.println ("ArmaduraMedieval"+ArmaduraMedieval.toString());
		
	
	Coleccion temporal= new Coleccion();
	temporal.setTematica("Armas");
	temporal.setEpoca("Edad Media");
	temporal.setCiudad("Oviedo");
			
		
		

	}

}
