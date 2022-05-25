import java.util.Scanner;

public class EntradaeSaida {
	public static void main(String[]args) {

		Scanner in = new Scanner(System.in);
			System.out.println("Digite o seu Nome Completo:");
			String nome=in.nextLine();
			System.out.println("Digite a sua Idade:");
			int idade= in.nextInt();
			
			//System.out.println("Digite o seu Salário:");
			//double salario=in.nextDouble();
			
			System.out.println("Nome :"+nome);
			System.out.println("idade :"+idade);
			//System.out.println("salario :"+salario);//
		
			
			
			System.out.println("Digite sua 1º Nota:");
			int nota1= in.nextInt();
			
			System.out.println("Digite sua 2º Nota:");
			int nota2=in.nextInt();
			
			
			System.out.println("Nota1:"+ nota1*4);
			System.out.println("Nota2:"+ nota2*6);
			int Resultado = nota1*4;
			 int Resultado2 = nota2*6;
			System.out.println("Resultado final:"+(Resultado+Resultado2)/2);
	
		
	}

}
