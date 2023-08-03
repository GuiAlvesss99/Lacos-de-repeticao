package lacosderepeticao;
import java.util.Scanner;
public class Lista02ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner leia= new Scanner(System.in);
    
    int idade;
    int maioresde50=0;
    int menoresde21=0;
    
    
    System.out.println("Digite sua idade:");
    idade = leia.nextInt();
    
    while(idade>=0) {
    	
    	
    	if (idade<21) {
    		menoresde21++;	
    	}else if (idade>50) {
    		maioresde50++;
    		
    	}
    	System.out.println("Digite uma idade:");
    	idade= leia.nextInt();
    	}
	System.out.println("\nTotal de pessoas menores que 21 anos:"+menoresde21);
	System.out.println("Total de pessoas maiores que 50 anos:"+maioresde50);
    
    }
}


