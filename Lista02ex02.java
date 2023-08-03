package lacosderepeticao;
import java.util.Scanner;
public class Lista02ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia=new Scanner(System.in);
		
		int idade, sexo, categoria, devbackend=0, devfrontend=0, devmobile=0, devfullstack=0;
	    String continuar;
		
		while(true) {

			System.out.println("Digite sua idade:");
			idade= leia.nextInt();
			
			System.out.println("Digite o sexo (1- Masculino, 2- Feminino, 3- Outros):");
			sexo= leia.nextInt();
			
			System.out.print("Digite a Categoria (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
			categoria= leia.nextInt();
			
			if(categoria ==1) {
			devbackend++;
			}else if (sexo==2 && categoria==2) {
				devfrontend++;
		    }else if (sexo==1 && categoria==3) {
		        devmobile++;
		    }else if (sexo==2 && categoria==4) {
		        devfullstack++;
		    }
			
			
			System.out.println("Deseja continuar? [S/N]");
			continuar=leia.next();
			
			if(continuar.equalsIgnoreCase("n")) {
			  break;	
			}
			}
		  System.out.printf("\nO número de desenvolvedoras Backend foi de:");
		  System.out.printf("\nO número de mulheres Backend foi de:");
		  System.out.printf("\nO número de desenvolvedores homens maiores que 40 foi de:");
		  System.out.printf("\nO número de desenvolvedoras mulheres menores que 30 foi de:");
		}
}		
		
		
	



