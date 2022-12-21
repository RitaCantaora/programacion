package objetos;

import java.util.Random;

public class Cuenta {
//atributos
	private String titular;
	private String numeroCuenta = "";
	private double saldo;
	private String pin = "";

	// Constructor parametrizado
	public Cuenta(String titular, double saldo) {

		this.titular = titular;
		//this.numeroCuenta = 
		generarNumeroCuenta();
		this.saldo = saldo;
		this.pin = generarPin();

	}

	// generar pin aleatorio
	private String generarPin() {
		// restamos el alto menos el bajo de codigo ascii y asi tenemos el numero por el
		// que tenemos que multiplicar
		// y el otro es donde empieza el codigo asciii

		int numerosValidos = 0;
		while (numerosValidos < 6) {

			// poniendo el menor(<) hasta cero nos da 6 cosas exactas para hacer 6 intentos
			// validos alfanumericos

			int numero = (int) (Math.random() * 74 + 48);
			char letra = (char) numero;

			// si son los ascii que busco concateno con el pin y sumo uno a los numero
			// validos

			if (((numero >= 48) && (numero <= 57)) || ((numero >= 65) && (numero <= 90))
					|| ((numero >= 97) && (numero <= 122))) {

				pin += letra;
				numerosValidos++;
			}

		}
		return pin;
	}

	private String generarNumeroCuenta() {
		int numerosValidos = 0;
		numeroCuenta = "ES";
		while (numerosValidos < 20) {
			int numero = (int) (Math.random() * 9 + 48);
			char letra = (char) numero;

			if ((numero >= 48) && (numero <= 57)) {

				numeroCuenta += letra;
				numerosValidos++;
			}

		}
		return numeroCuenta;
	}
/*
 * private void generarNumeroCuenta() {
		Random r=new Random();
		numeroCuenta="ES";
		for(int i = 0; i <20; i ++) {
			int numero=r.nextInt(10);
			this.numeroCuenta += numero;
			}
		
		int c=r.nextInt (90-65)+65;
		char letra=(char)c;
		this.numeroCuenta+=letra;
		
		int l=r.nextInt (25)+97;
		
		char letras=(char) ((char)(c)|(l));
		this.numeroCuenta+=letras;
		}
		
	*/	
	
	
	public Cuenta(Cuenta otraCuenta) {

		this.titular = otraCuenta.titular;
		this.pin = otraCuenta.pin;

	}

	/**
	 * Ingreso o reitegro de dinero en una cuenta, actualizando el saldo con la
	 * cantidad que aportamos.
	 * 
	 * @param cantidad importe a ingresar en la cuenta, positivo a ingresar y
	 *                 negativo a reintegrar
	 * @return nuevo saldo actualizado
	 */
	public double ingresoReintegro(double cantidad) {

		saldo += cantidad;
		return saldo;
	}

	/**
	 * Este metodo usa dos cuentas para hacer la transferencia La primera es this,
	 * que es quien llama a la operación y recibe el dinero La segunda es
	 * cuentaDeudora, que es quien pierde el dinero
	 * 
	 * @param cantidad      Dinero a transferir
	 * @param cuentaDeudora La cuenta de la que se va a quitar el dinero.
	 */
	public void transferencia(double cantidad, Cuenta cuentaDeudora) {

		if (cuentaDeudora.saldo >= cantidad) {

			saldo += cantidad;
			cuentaDeudora.saldo -= cantidad;
		} else {

			saldo += cuentaDeudora.saldo;
			cuentaDeudora.saldo = 0;
		}

	}

	/*
	 * metodo que imprime los atributos de un objeto
	 */
	public void imprimir() {

		System.out.println("titular: " + titular);
		System.out.println("numero cuenta: " + numeroCuenta);
		System.out.println("saldo: " + saldo);
		System.out.println("pin: " + pin);
	}

	/*
	 * Estos son los setters Hemos pensado que no hace falta el del numero de cuenta
	 * porque no va a cambiar
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	/*
	 * Estos son lo getters
	 */
	public String getTitular() {
		return titular;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getPin() {
		return pin;
	}

}
