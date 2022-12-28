package objetos;

public class StartPersona {

	public static void main(String[] args) {

		Persona pepe = new Persona(65, 1.70f, 50, 'H', "Pepe");
		
		System.out.println("Pepe");
		pepe.imprimir();
		
		if (pepe.MayorEdad() == true) {
			System.out.println("Es Mayor de Edad");
		} else {
			System.out.println("Es Menor");
		}
		
		Persona maria = new Persona(50, 1.60f, 17, 'M', "Maria");
		
		
		System.out.println("María");
		maria.imprimir();


		if (maria.MayorEdad() == true) {
			System.out.println("Es Mayor de Edad");
		} else {
			System.out.println("Es Menor");
		}

	}

}
