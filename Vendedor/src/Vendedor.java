import java.util.Scanner;

public class Vendedor {

	public static void main(String[] args) {
		String nome;
		double salario;
		double vendaDoMes;
		double comissao;
		Scanner in=new Scanner(System.in);
		System.out.println("Digite seu nome:");
		nome=in.next();
		System.out.println("Informe o seu salario:");
		salario=in.nextDouble();
		System.out.println("Quantas vendas fez no mes:");
		vendaDoMes=in.nextDouble();
		comissao=(vendaDoMes*15)/100;
		System.out.printf("O Nome do vendendor é:%s",nome);
		System.out.println();
		System.out.printf("Seu salario é:%.2f",salario);
		System.out.println();
		System.out.printf("O salario final é:%.2f",(comissao+salario));
		
		
	}

}
