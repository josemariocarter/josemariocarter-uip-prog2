package trabajador;
import java.util.Scanner;
public class Trabajador {
	public String nombre [] = new String [6]  ;
public int horas []  = new int [6];
public float sueldo [] = new float [6];
public float resultado [] = new float [6];


void menu_1 () {
	for (int i =1 ; i<6 ;i++ ){
	System.out.println("ingresar nombre"); 
	Scanner a = new Scanner (System.in);
	nombre [i] =a.nextLine();
	System.out.println("ingresar sueldo");
	sueldo [i] = a.nextFloat();
	System.out.println("ingresar horas");
	horas [i] =a.nextInt();
	}
	for (int i =1 ; i<6 ;i++ ){
	if (horas [i] >=40){
		resultado [i]  = (float) (sueldo[i]*1.50);
		System.out.println("Su nombre es " +nombre[i]);
		System.out.println("EL Salario neto es "+resultado[i]);
		
	}
	else if (horas [i]< 40 ){
		
		System.out.println("Su nonbre es "+nombre[i]);
		System.out.println("Su Salario neto es "+sueldo[i]);
		
		
	}
	}
	
} 


}
