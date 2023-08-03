package lacosderepeticao;
import java.util.Scanner;
public class Lista01ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,i;
			Scanner leia =new Scanner(System.in);
			
			System.out.println("Escreva o primeiro número");
			 num1= leia.nextInt();
			 
			 System.out.println("Escreva o segundo número");
			 num2= leia.nextInt();
			 
			 if(num1>num2) {
				 System.out.println("\n O intervalo é inválido"); 
				 return;
		 }
			 
			 for (i= num1; i<= num2;i++) {
				if(i %3==0 && i %5==0) {
			System.out.printf("\n%d é divisível por 3 e 5",i);	
				}
			 }
			
	}

}
