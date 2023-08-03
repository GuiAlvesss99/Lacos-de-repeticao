package lacosderepeticao;
import java.util.Scanner;
public class Lista03ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia= new Scanner(System.in);
		
		int numero, soma=0;
		
	
		do {
			System.out.println("Digite um numero");
			numero= leia.nextInt();
			
			
			if(numero>=0) {
				soma= soma+numero;
				
			}
		    }while(numero!=0); {
		    	
		    	System.out.println("\nA soma dos números positivos é:"+soma);
				}
			}
}		
			
		
		
	


