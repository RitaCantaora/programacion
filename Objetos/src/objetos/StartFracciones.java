package objetos;

public class StartFracciones {

	public static void main(String[] args) {
		
		Fraccion f1=new Fraccion(2,3);
		Fraccion f2=new Fraccion(3,4);
		
		f1.imprimir();
		f2.imprimir();
		
		Fraccion f3 = f1.multiplicar(f2);
		
		f3.imprimir();
	}

}
