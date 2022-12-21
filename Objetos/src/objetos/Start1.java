package objetos;

public class Start1 {

	public static void main(String[] args) {

		Termometro oviedo = new Termometro("Oviedo", 10.00f);
		Termometro gijon = new Termometro("Gijon", 15.00f);
		Termometro aviles = new Termometro("aviles", 12.00f);

		float temperaturaMedia = oviedo.getTemperatura() + gijon.getTemperatura() + aviles.getTemperatura();
		temperaturaMedia /= 3;

		System.out.println("La temperatura media es de " + temperaturaMedia);

		/*
		 * 
		 * //pido el get pero hago una varable par luego poder trabajar con ella float
		 * temperaturaEnOviedo=oviedo.getTemperatura();
		 * 
		 * //otra opcion es pedirla directanmente en syso System.out.println("En"
		 * +oviedo.getlocalidad() +"hay "+temperaturaEnOviedo);
		 * 
		 */

	}
}