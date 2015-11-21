package equipo;
import java.util.Random;

public class Generar{
	
	public void regla_1(){
		
		Random op = new Random ();
		int prob = op.nextInt(100);
		if (prob>90){
			System.out.println("Que metio goles");
		}
		else if (prob<89){
			System.out.println("Que no metio goles");
		}
	}

	public void regla_2(){
		Random op = new Random ();
		int prob = op.nextInt(100);
		if (prob>95){
			System.out.println("metio goles al portero");
		}
		else if (prob <89){
			System.out.println("no metieron goles al portero");
		}
	}
	
	public void regla_3(){
		Random op = new Random ();
		int prob = op.nextInt(100);
		if (prob<5){
			System.out.println("Gano el equipo");
			System.out.println("El portero da buenos comentarios");
		}
		else if (prob>6){
			System.out.println("Perdio el equipo");
			System.out.println("El portero da malos comentarios");
			
			}
	}
	
	}
	
	
	

