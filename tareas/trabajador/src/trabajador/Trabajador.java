package trabajador;
import java.util.Scanner;
public class Trabajador {
public String nombre;
public int horas ;
public float sueldo,resultado;


void menu_1 () {
	for (int i =1 ; i<5 ;i++ ){
	System.out.println("ingresar nombre"); 
	Scanner a = new Scanner (System.in);
	nombre =a.nextLine();
	System.out.println("ingresar sueldo");
	sueldo = a.nextFloat();
	System.out.println("ingresar horas");
	sueldo=a.nextInt();
	if (horas >=40){
		resultado = (float) (sueldo*1.50);
		System.out.println("Su nombre es " +nombre);
		System.out.println("EL Salario neto es "+resultado);
		
	}
	else if (horas < 40 ){
		
		System.out.println("Su nonbre es "+nombre);
		System.out.println("Su Salario neto es "+sueldo);
		
		
	}
	}
	
} 


}
