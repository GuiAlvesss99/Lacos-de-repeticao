package lacosderepeticao;

import java.util.Scanner;

public class Exemplowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número qualquer: ");
		numero = leia.nextInt();//6
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				somaPar += numero; // somaPar = somaPar + numero
			}else {
				contImpar++; // contImpar = contImpar + 1
			}
			System.out.println("\nEntre com um número qualquer: ");
			numero = leia.nextInt();//8 0
		}
		System.out.println("\nSomatório dos números pares: "+somaPar);
		System.out.println("\nQuantidade de números impares: "+contImpar);

	}

}