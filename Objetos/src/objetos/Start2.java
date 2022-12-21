package objetos;

public class Start2 {

	public static void main(String[] args) {
/*
		String palabra = "hola" + "Marcos" + "¿q tal?";
		System.out.println(palabra);
		palabra += "adios";
		System.out.println(palabra);
*/
		
		



				Cuenta cuentaMarian = new Cuenta("Marian",41.5);
				cuentaMarian.imprimir();
				
				double saldoNuevo = cuentaMarian.ingresoReintegro(1000);
				cuentaMarian.imprimir();
				cuentaMarian.ingresoReintegro(-200);
				cuentaMarian.imprimir();
				
				System.out.println("-------------------------------");
				
				Cuenta david = new Cuenta("David Martinez",1000);
				cuentaMarian.transferencia(5000, david);
				
				cuentaMarian.imprimir();
				david.imprimir();
			
				
				
			}

		}
		
