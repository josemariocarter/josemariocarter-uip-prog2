import java.util.Scanner;
public class Compra {
	
	public static void main(String[] args) {
		double compra,descuento,total;
	
		System.out.println("ingrese costo de la compra");
		Scanner S = new Scanner(System.in);
		compra=S.nextFloat();
		if(compra>=500){
			descuento=compra*0.03;
			total=compra+descuento;
			System.out.println("El total de la compra es de:" +total);
			} 
			else 
				if(compra <500 && compra>=200 )
				{ 
					descuento=compra*0.02;
					total=compra+descuento;
		System.out.println("El total de la compra es de:" +total);
	
	}
				else 
					if(compra <200 && compra>=100 )
					{ 
						descuento=compra*0.01;
						total=compra+descuento;
			System.out.println("El total de la compra es de:" +total);
		
		}
	}
}