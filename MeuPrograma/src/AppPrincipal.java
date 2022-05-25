
public class AppPrincipal {

	public static void main (String [] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Hiany");
		pessoa.falar();
		pessoa.escreverNome();
		
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Aline");
		pessoa1.falar();
		pessoa1.escreverNome();
		
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Joas");
		pessoa2.falar();
		pessoa2.escreverNome();
	}
}