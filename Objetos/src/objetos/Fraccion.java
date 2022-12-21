package objetos;

public class Fraccion {
	//atributos
	private int numerador;
	private int denominador ;
	
	public Fraccion (int numerador ,int denominador) {
		
	//constructor por defecto	
		this.numerador=numerador;
				this.denominador=denominador;	
	}
	//denominador copia
	
	public Fraccion(Fraccion copiable) {
		
		this.numerador=copiable.numerador;
		this.denominador=copiable.denominador;
		
		
	}
	//setters
	
	public void setNumerador(int numerador) {
		
	}
	
public void setDenominador(int denominador) {
	
		
}

public int  getNumerador() {
	
	return numerador;
}

public int  getDenominador() {
	
	return denominador;
}

public Fraccion multiplicar(Fraccion multiplicador) {

	Fraccion devolver = new Fraccion(1,1);
	
	 devolver.numerador = this.numerador*multiplicador.numerador;
	 devolver.denominador = this.denominador*multiplicador.denominador;
	 
	 return devolver;
	 	
}
 public void imprimir() {
	 System.out.println(numerador+"/"+denominador);
	 
 }


}