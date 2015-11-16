package lab;
import java.util.Scanner;




public class Laboratario {

	double calif [] = new double [5];
	
	
	

	
	public void Lab (){
		for(int a=1;a<6;a++){
		Scanner Keyboard = new Scanner (System.in);
		System.out.println("Digite la califacion del laboratrio "+a);
		calif[a]= Keyboard.nextDouble();
		}
		for(int a=1;a<6;a++){
		System.out.println(" su calificacion es "+calif[a]);
		}

	}
			
			
		}
			
		


	
		
		
		



		
		
		
		
		
		
	
	
	
	
