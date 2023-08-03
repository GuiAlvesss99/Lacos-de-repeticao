package lacosderepeticao;
import java.util.Scanner;
public class Lista01ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner leia= new Scanner(System.in);
     
     int num1, impar=0, par=0, i;
     
     for( i=0;i<=10;i++) {
    	 System.out.println("Digite um numero");
    	 num1=leia.nextInt();
    	 
    	 if(num1 %2==0) {
    		 par++;
    	 } 
    	 else {
    	impar++;
    		 }
    	 }
     
    	 System.out.println("Total de números pares:"+par);
    	 System.out.println("Total de números ímpar:"+impar);
     }
    	 
     }
	


