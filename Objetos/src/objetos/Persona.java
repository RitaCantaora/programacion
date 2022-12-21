package objetos;

import java.util.Random;

public class Persona {

	
	// atributos

	private float peso;
	private float altura;
	private int edad;
	private char sexo;
	private String nombre;
	private String Dni = "";

	// constructores

	public Persona(float peso, float altura, int edad, char sexo, String nombre) {

		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		this.sexo = sexo;
		this.nombre = nombre;
		generararDni();

	}

	// setters

	public void SetPeso(float peso) {

		this.peso = peso;
	}

	public void SetAltura(float altura) {

		this.altura = altura;
	}

	public void SetEdad(int edad) {

		this.edad = edad;
	}

	public void SetSexo(char sexo) {

		this.sexo = sexo;
	}

	public void SetNombre(String nombre) {

		this.nombre = nombre;
	}

	public void SetDni(String Dni) {

		this.Dni = Dni;
	}

//getters

	public float getPeso() {

		return peso;
	}

	public float getAltura() {

		return altura;

	}

	public int getEdad() {

		return edad;

	}

	public char getSexo() {

		return sexo;
	}

	public String getNombre() {

		return nombre;

	}

	public String getDni() {

		return Dni;
	}

//METODOS

	public float generarImc() {

		float generarImc = peso / (altura * altura);
		if (generarImc < 20) {

			return -1;
		} else {
			if (generarImc >= 20 && generarImc <= 25) {

				return 0;
			} else if (generarImc > 25) {

				return 1;
			}
		}
		return 0;
	}

	public boolean MayorEdad() {

		boolean MayorEdad = false;

		if (this.edad >= 18) {
			MayorEdad = true;
		}
		return MayorEdad;
	}

	private void generararDni() {

		Random r = new Random();
		for (int i = 0; i < 9; i++) {
			int n = r.nextInt(10);
			this.Dni += n;
			
		}
		int c=r.nextInt(90-65)+65;
		char letra = (char)(c);
		this.Dni += letra;
		
		
		
		
		/*
		Random n = new Random();
		for(int i=0;i<9;i++) {
		int c=n.nextInt(90-65)+65;
		char letra = (char)(c);
		this.Dni += letra;
	
		}
		*/
		
	}

	public void imprimir() {

		System.out.println("Indice de Masa Corporal"+""+generarImc());
		System.out.println("Mayor de Edad"+""+MayorEdad());
		System.out.println("DNI"+this.Dni);

	}

}
