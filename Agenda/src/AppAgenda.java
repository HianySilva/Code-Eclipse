import java.util.Scanner;

public class AppAgenda {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int opcao=0;
		while(opcao!=5) {
			System.out.println("Escolha uma Opção:");
			System.out.println("1-Adicionar Contato");
			System.out.println("2-Consultar Contato");
			System.out.println("3-Alterar Contato");
			System.out.println("4-Excluir Contato");
			System.out.println("5- Sair");	
		}
		opcao=in.nextInt();
		System.out.println("Informe seu Nome de Contato");
		String nome=in.next();
		System.out.println("Informe seu Numero de Contato");
		int numero=in.nextInt();
		
		if(opcao==1) {
			System.out.println("Adicione um novo Contato:"+(nome+numero));
		}
		else if(opcao==2) {
			System.out.println("Consultar Contato:"+(nome+numero));
		}
		else if(opcao==3) {
			System.out.println("Alterar o Contato:"+(nome+numero));
		}
		else if(opcao==4) {
			System.out.println("Excluir Contato:"+nome+numero);
		}
		
		
		
				
		
	}

}
