package lacosderepeticao;

import java.util.Scanner;

public class Exemplodowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabuada,x=1,resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor da tabuada: ");
		tabuada = leia.nextInt();
		
		do {
			resultado = tabuada * x;
			System.out.println("\n"+tabuada+" X "+x+" = "+resultado);
			x++;// x = x + 1
			
		}while(x<=10);
	}

}