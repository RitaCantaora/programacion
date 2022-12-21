package objetos;

public class StartRelojOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Reloj garmin = new Reloj(23, 59, 50);
		
		
		Reloj casio ;
		//en casio voy a recibir lo que tengo en garmin pero con un segundo mAS 
		
		casio=garmin.addSegundos();
		System.out.println("reloj casio");
		casio.imprimir();
		System.out.println("-------------");
		
		System.out.println("reloj garmin");
		garmin.imprimir();
		System.out.println("------------");
 																																																																			
		System.out.println("reloj suma");
		Reloj suma=garmin.sumar(casio);
		suma.imprimir();
		System.out.println("-----------");
		
		*/
		//al imprimir el to String en el start le decimos q imprima el objeto NO un metodo
		Reloj casio =new Reloj(23, 59, 50);
			 
		System.out.println(casio);
		
		Reloj garmin = new Reloj(21, 59, 50);
		System.out.println(garmin);

	}

}
