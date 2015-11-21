package problema_1;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int a,b,sum=0,sumar=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Digite un numero");
		a = leer.nextInt();
		System.out.println("Digite un numero");
		b = leer.nextInt();
		sumar = a+b;
		int aux = sumar;
		while (sumar != 0) 
		{ 
		sum = sum + (sumar % 10);  
		sumar= sumar / 10;  
		} 
		System.out.println ("La suma de los digitos de " + aux + " es: " + sum); 
		
	}

}
