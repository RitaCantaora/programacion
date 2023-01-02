package objetos;

import objetos.Ong;
import objetos.Proyecto;
import objetos.Sede;

@SuppressWarnings("unused")
public class StartOng {

	public static void main(String[] args) {

		// PROYECTOS
		Proyecto Salvar = new Proyecto();
		Salvar.setPais("Argelia");
		Salvar.setPoblacion("Argel");
		Salvar.setnumeroHabitantes(23000000);
		Salvar.setimporteInversion(65000);
		Salvar.setidentificador("ES009");

		Proyecto Vivir = new Proyecto();
		Vivir.setPais("Alemania");
		Vivir.setPoblacion("Berlín");
		Vivir.setnumeroHabitantes(56006000);
		Vivir.setimporteInversion(75000);
		Vivir.setidentificador("VD456");

		Proyecto Compartir = new Proyecto();
		Compartir.setPais("Bélgica");
		Compartir.setPoblacion("Bruselas");
		Compartir.setnumeroHabitantes(98765000);
		Compartir.setimporteInversion(45000);
		Compartir.setidentificador("AD456");

		// SEDES
		Sede puntoCero = new Sede();
		puntoCero.setPais("España");
		puntoCero.setCiudad("Oviedo");
		puntoCero.setDireccion("Poligono,34");
		puntoCero.setNombreDirecctor("SANTIAGO");
		puntoCero.setTelefono("987656342");
		puntoCero.setPresupuesto(9867456);
		puntoCero.setProyecto1(Compartir);

		Sede principal = new Sede();
		principal.setPais("California");
		principal.setCiudad("San Diego");
		principal.setDireccion("Firulais,14");
		principal.setNombreDirecctor("Adrian");
		principal.setTelefono("987656553");
		principal.setPresupuesto(654235);
		principal.setProyecto2(Vivir);

		Sede Segunda = new Sede();
		Segunda.setPais("China");
		Segunda.setCiudad("Shangai");
		Segunda.setDireccion("LMD, 9");
		Segunda.setNombreDirecctor("Macarena");
		Segunda.setTelefono("786543245");
		Segunda.setPresupuesto(867432);
		Segunda.setProyecto3(Salvar);

		// ONG´s
		Ong Unicef = new Ong();
		Unicef.setNombre("Unicef");
		Unicef.setCeo("Manuel");
		Unicef.setPresupuesto1(458394);
		Unicef.setSede1(principal);
		
		
		System.out.println("Unicef"+Unicef.toString());
		System.out.println("Sede Segunda"+Segunda.toString());
System.out.println("Sede Principal"+principal.toString());
System.out.println("Sede Cero"+puntoCero.toString());
System.out.println("Proyecto Compartir"+Compartir.toString());
System.out.println("Proyecto Vivir"+Vivir.toString());
System.out.println("Proyecto Salvar"+Salvar.toString());
	}

}
