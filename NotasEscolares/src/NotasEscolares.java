import java.util.Scanner;

public class NotasEscolares {
	public static void main(String[]args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite seu Nome:");
		String nome=in.nextLine();
		System.out.println("Digite sua 1� Nota:");
		double nota1=in.nextDouble();
		System.out.println("Digite sua 2� Nota2:");
		double nota2=in.nextDouble();
		
		
		double Media=((nota1+nota2)/2);
		System.out.println("Sua Media:"+(nota1+nota2)/2);
		
		if (Media>=7) {
			System.out.println("Voc� est� Aprovado!");
			
		}else if(Media<4){
			System.out.println("Voc� est� Reprovado!");
			
		}else {
			System.out.println("Voc� est� na Prova final");
		}
	
		
	}
	
	
	

}
