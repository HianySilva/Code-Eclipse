import java.util.Scanner;

public class AlunoApp {
	public static void main(String[]args) {
		/*Scanner in=new Scanner(System.in);
		System.out.println("Digite seu Numero da Matricula:");
		int matricula=in.nextInt();
		System.out.println("Digite o Seu Nome:");
		String nome=in.next();
		System.out.println("Informe sua Nota1:");
		double nota1=in.nextDouble();
		System.out.println("Informe sua Nota2:");
		double nota2=in.nextDouble();
		System.out.println("Informe Sua Nota do Trabalho:");
		double ntrabalho=in.nextDouble();
		
		double media=(((nota1*2.5)+(nota2*2.5)+(ntrabalho*2))/(2.5+2.5+2));
		System.out.printf("Sua Media:%.2f",media);
		System.out.println("");
		if (media>6) {
			System.out.println("Você está Aprovado!");
			
		}else if(media<6){
			System.out.println("Você está na Prova final");
			
		
		}*/
		Aluno aluno= new Aluno(000,"Lucas",8,8,6);
		aluno.calcularMedia();
		System.out.printf("O aluno %s: ficou com a media:%.2f",aluno.getNome(),aluno.calcularMedia());
		System.out.println("");
		Aluno aluno2=new Aluno(223,"Julia",7,8,6);
		System.out.printf("aluna %s:",aluno2.getNome());
		aluno2.suaNota(aluno2.calcularMedia());
		
		
	}

}