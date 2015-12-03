import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Supermercado99 {
	
	public void super_1 (){
	
	
				List<String> Nombres;
				Nombres = new ArrayList<>();
				int a,opciones;
				String nombre ;
				String o ="s";
				Scanner teclado = new Scanner(System.in);
				try{
					do{
				
					System.out.println("\t\tSupermercado 99");
					System.out.println("Usted puede eligir 5 productos por Supermercado");
					System.out.println("\t1- Agregar producto 2- Ver lista de productos 3- Eliminar productos 4- Salir");
					opciones = teclado.nextInt();
					switch (opciones) {
					case 1:
						for(int as=1;as<6;as++){
						System.out.println("Ingresar producto "+as);
						nombre = teclado.next();
						Nombres.add(nombre);
						}
						System.out.println("Para regresar ingresar una tecla");
						o = teclado.next();

						 break;
					case 2: 
					System.out.println("Lsita de productos");
					 for (int i=0;i<Nombres.size();i++){
							System.out.println(Nombres.get(i));}
							System.out.println("Para regresar ingresar una tecla");
							o = teclado.next();
								
						
						break;
						
						
					case 3:
						System.out.println("Eliminar productos");
						System.out.println();
							 System.out.println("Producto que no quiere");
							 nombre = teclado.next();
							 Nombres.remove(nombre);
				
						 System.out.println("Para regresar ingresar una tecla");
							o = teclado.next();
						break;
					case 4: 
						System.out.println("Gracias por su compra");
						System.exit(0);
						break;
					}
				} while(o!="x");
				 }catch(Exception e){
			    	   System.out.println("Ingresa un numero (valor no valido)");
				 }
	}
}
				
					
				
			

			
			
			
		
	
	
	


