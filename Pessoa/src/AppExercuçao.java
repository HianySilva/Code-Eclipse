import java.util.Locale;
import java.util.Scanner;
public class AppExercuçao {
	public static void main(String[]args) {

	Scanner in=new Scanner(System.in);
	in.useLocale(Locale.US);
	System.out.println("Digite seu nome:");
	String nome=in.next();
	System.out.println("Digite o ano de nascimento:");
	int anodoNascimento=in.nextInt();
	System.out.println("Digite seu cpf:");
	int cpf=in.nextInt();
	System.out.println("Informe sua altura:");
	double altura=in.nextDouble();
	Pessoa p=new Pessoa(nome,anodoNascimento,cpf,altura);
	p.imprimirDados();
	System.out.println(p.calcularIdade());
	
	


	}

}
