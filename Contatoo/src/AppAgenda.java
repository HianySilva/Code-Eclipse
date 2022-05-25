import java.util.Scanner;

public class AppAgenda {
	public static void main(String[] args) {

		int opcao;
		
		Scanner in = new Scanner(System.in);
		Agenda a=new Agenda();
		
		
		while(true) {
			System.out.println("");
			System.out.println("MENU PRINCIPAL");
			System.out.println("");
			System.out.println("1 - Adicionar Contato:");
			System.out.println("2 - Consultar Contato");
			System.out.println("3 - Alterar Contato");
			System.out.println("4 - Excluir Contato");
			System.out.println("5 - Sair");
			
			System.out.println("Digite sua opção: ");
			opcao = in.nextInt();
			
	
			if (opcao == 1) {
				a.adicionar();
				
				
				
			}else if (opcao==2) {
				a.consultar();
			}else if (opcao==3) {
				a.alterar();
			}else if (opcao==4) {
				a.excluir();
				
			}else  if(opcao==5){
				System.out.println("Fim do programa");
				break;
				
			}else  {
				System.out.println("O valor esta invalido");
			}
			
		}
}
}