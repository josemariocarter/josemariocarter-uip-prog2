package semana10;

import java.util.Scanner;

public class Menu {
	
	 public void mostrar_opciones (){
			String nombre;
			String a;
			char op;
			int opciones;
			int peso = 0;
			String o ="s";
			Scanner teclado = new Scanner(System.in);
			System.out.println("Crear una Boa");
			System.out.println("ingresar nombre de la Boa");
			nombre = teclado.nextLine();
			do{
		 System.out.println("Eliga 1 para alimentar la boa "+nombre);
		 System.out.println("Eliga 2 para jugar con la boa "+nombre);
		 System.out.println("Eliga 3 para dormir la boa "+nombre);
		 System.out.println("Eliga 4 para salir ");
			opciones = teclado.nextInt();
			 switch (opciones) {
			 case 1:
				 peso=peso+5;
				 if(peso>15|| peso<2){
						System.out.println("Su boa murio");
						System.exit(opciones); 
					}
				
				System.out.println("El peso de tu boa "+peso);
				System.out.println("Para regresar digite una letra");
				o = teclado.next();
				 break;
			 case 2:
				 peso=peso-3;
				 if(peso>15|| peso<2){
						System.out.println("Su boa murio");
						System.exit(peso); 
					}
				
					System.out.println("Estas jugando la boa"+nombre);
					System.out.println("El peso de la boa es  " +peso);
					System.out.println("Para regresar digite una letra");
					o = teclado.next();
				 break;
			 case 3:
				 peso=peso+1;
				 if(peso>15 || peso<2 ){
						System.out.println("Su boa murio");
						System.exit(peso); 
					}
					System.out.println("La boa esta dormiendo");
					System.out.println("El peso de la boa es  "+peso);
					System.out.println("Para regresar digite una letra");
					o= teclado.next();
				 break;
			 case 4:
				 System.out.println("Fin de boa "+nombre);
				 System.exit(peso); 

				 break;
					
				 }
			 } while(o!="x");
	 }
			

			}
			
	 