import java.util.ArrayList;
import java.util.Scanner;

public class AppVeiculos {
	public static void main(String[]args) {
		ArrayList<Carro> carros=new ArrayList<Carro>();
		ArrayList<Moto> motos=new ArrayList<Moto>();
		String marca;
		String modelo;
		String ano;
		String cor;
		int opcao;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("MENU PRINCIPAL");
			System.out.println("");
			System.out.println("1 - Criar Novo Objeto:");
			System.out.println("2 - Consultar Objeto");
			System.out.println("3 - Alterar Objeto");
			System.out.println("4 - Excluir Objeto");
			System.out.println("5 - Sair");
			
			System.out.println("Digite sua opção: ");
			opcao=in.nextInt();
			
			if(opcao==1) {
				System.out.println("Criar novo objeto:");
				System.out.println("Digite 1 para criar o Carro:");
				System.out.println("Digite 2 para criar a Moto:");
				System.out.println("Digite sua opção: ");
				opcao=in.nextInt();
				
				
				if(opcao==1) {
					String nome= "Carro";
					System.out.println("Digite a marca:");
					marca=in.next();
					System.out.println("Digite o modelo:");
					modelo=in.next();
					System.out.println("Digite o ano:");
					ano=in.next();
					System.out.println("Digite a cor:");
					cor=in.next();
					Carro c =new Carro(marca, modelo, ano, cor, false, 0);
					carros.add(c);
				
				}else if(opcao==2) {
					System.out.println("Digite a marca:");
					marca=in.next();
					System.out.println("Digite o modelo:");
					modelo=in.next();
					System.out.println("Digite o ano:");
					ano=in.next();
					System.out.println("Digite a cor:");
					cor=in.next();
					Moto m=new Moto(marca, modelo, ano, cor, false, 0);
					motos.add(m);
					
					
				}else if (opcao==5) {
					System.out.println(carros.size());
					break;
					
				}
				else {
					System.out.println("Valor digitado está inválido");
				} 
			}
		}
		
		
		
	}
	

}
