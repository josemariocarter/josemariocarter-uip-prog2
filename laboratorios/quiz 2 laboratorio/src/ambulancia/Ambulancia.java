package ambulancia;
import java.util.Scanner;
public class Ambulancia {

	public static void main(String[] args) {
		String o ="s";
		float velocidad,distancia,tiempo;
		Scanner a = new Scanner(System.in);
		while(o!="x") {
		System.out.println("introductir velocidad");
		
		velocidad =a.nextFloat();
		System.out.println("introducir distancia");
		distancia =a.nextFloat();
		tiempo=(distancia/velocidad);
		System.out.println("el tiempo necesario que llege es "+tiempo);
		 
	
		System.out.println("Presione x para salir...");
		o = a.next();
		
		}
			
	}
}

