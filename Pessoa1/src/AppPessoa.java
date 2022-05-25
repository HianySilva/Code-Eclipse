
public class AppPessoa {

	public static void main(String[] args) {
		Pessoa p=new Pessoa("Hiany" ,2001,1.60);
		p.ImprimirDados();
		p.CalcularIdade();

		System.out.println();

		Pessoa p2=new Pessoa("Leonardo Lima",1800,1.72);
		p2.ImprimirDados();
		p2.CalcularIdade();


	}

}
