package cajero;
import java.util.Scanner;
public class Cliente extends Banquero{
public void iniciar_sesion(){

	int n = 0; 
	int cont=3; 
	int pass;
	int ping = 2015;
	int opciones;
	int a,b;
	Banquero op = new Banquero();
	op.getDinero();
	String o ="s";
	while(n<3){ 
		Scanner x = new Scanner (System.in);
		System.out.println("ingrese ping");
		pass=x.nextInt();
		
		if (pass==ping){ 
			do{
			System.out.println("Seleccione 1 para retirar dinero y ver estado de cuenta");
			System.out.println("Seleccione 2 para salir");
			opciones =x.nextInt();
			switch (opciones) {
			 case 1:
				 System.out.println("Ingrese cifra para retirar dinero");
				 a=x.nextInt();
				 b=a;
				 a=op.getDinero()-a;
				 System.out.println("Usted saco "+b);
				 System.out.println("su saldo es de "+a);
				 
				 System.out.println("Para regresar digite una letra");
					o = x.next();
				 break;
			 case 2:
				 
				System.out.println("Usted eligio la opcion salir");
				System.exit(0); 
				 break;
				
			} 
			} while(o!="x");
			System.exit(0); 
		}
			else { 
			--cont; 
			System.out.println("contraseña incorrecta" + "le queda " + cont + " intentos"); 

			} 


			if (cont==0){ 
			System.out.println("Cuenta bloqueada por un dia"); 
			System.exit(0); 

			}
	}
}
}


