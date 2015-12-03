import java.util.Scanner;

public class Super {
	public static void main(String[] args) {
		int a;
		Supermercado99 b = new Supermercado99();
		El_rey c = new El_rey ();
		Machetazo d = new Machetazo();
		Scanner teclado = new Scanner(System.in);
		System.out.println("\t\tELIGA SU SUPERMERCADO");
		try{
		System.out.println("1- Supermercado99 \t2- El rey \t3- Machetazo");
		a = teclado.nextInt();
		if(a==1){
		b.super_1();
		}
		if(a==2){
			c.super_2();
		}
		if(a==3){
			d.super_3();
		}
		 }catch(Exception e){
	    	   System.out.println("Ingresa un numero (valor no valido)");
}
	}
}