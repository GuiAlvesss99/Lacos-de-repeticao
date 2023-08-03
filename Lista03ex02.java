package lacosderepeticao;
import java.util.Scanner;
public class Lista03ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia=new Scanner(System.in);
		
		int numero,soma=0;
		float res,media = 0;
		
		do {
			System.out.printf("Digite um número:");
			numero = leia.nextInt();
			
		if (numero%3 == 0 && numero>0){
			soma= soma+numero;
			media++;
			
			
		}
	    }while(numero!=0); 
	   
	    	res=soma/media;
	    	System.out.println("\nA media dos multiplos de 3 é:"+res);
	    	
		}
}		
		