package lata;
import java.util.Scanner;
public class Lata {
 private float altura;
 private double diametro;

 public void lata ()

{
	altura =(float) 4.8;
	diametro =  2.5;
}

	public static void main(String[] args) {
		double radio,volumen,altura,superficie;
      //sacar altura y radio.
		System.out.println("introducir altura");
		Scanner a = new Scanner(System.in);
		altura= a.nextFloat();
		System.out.println("introducir radio");
		Scanner b = new Scanner (System.in);
		radio=a.nextFloat();
		//formula para sacar volumen.
		volumen= (3.1416*radio*radio*altura);
		superficie=(2 * 3.1416)*(radio*radio)+(2*3.1416)*(radio*altura);
		System.out.println("el volumen es: " +volumen);
		System.out.println("la superficie es: " +superficie);
	}

}
