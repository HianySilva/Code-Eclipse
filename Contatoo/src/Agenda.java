import java.util.Scanner;

public class Agenda {
	String nome;
	String numero;
	String[] contato=new String[10];
	int contar;
	int valor;
	String alteracao;
	String formatar;
	Scanner in = new Scanner (System.in);
	
	
	public void adicionar() {
		System.out.println("Digite o nome:");
		nome = in.next();
		System.out.println("Digite o numero:");
		numero= in.next();
		formatar="nome: "+nome+" - numero: "+numero;
		contar=0;
		for (String string : contato) {
			if(string!=null) {
				contar++;
				
			}
		}
		contato[contar]=formatar;
		
	}
	public void consultar() {
		for (String string : contato) {
			if(string!=null) {
				System.out.println(string);
				
			}
			
		}

		
	}
	public void alterar() {
		contar=0;
		for (String string : contato) {
			if (string!=null) {
				System.out.println("");
				System.out.printf("(%d) %s",contar,string);
				contar++;
			}
			
		}
		System.out.println("");
		System.out.println("Digite a posição do elemento que deseja alterar:");
		valor=in.nextInt();
		System.out.println("Digite o novo nome:");
		nome=in.next();
		System.out.println("Digite o novo numero:");
		numero=in.next();
		formatar="nome: "+nome+" - numero: "+numero;
		contato[valor]=formatar;
		consultar();
		
		
		
		
		
	}
	public void excluir() {
		contar=0;
		for (String string : contato) {
			if (string!=null) {
				System.out.println("");
				System.out.printf("(%d) %s",contar,string);
				contar++;
			}
			
		}
		System.out.println("");
		System.out.println("Qual posição deseja excluir:");
		valor=in.nextInt();
		contato[valor]=null;
		consultar();
			

			
	}
	
	
	
	
   
}