package polimorfismo;

public class App {
	public static void main(String[] args) {
		PessoaFisica pf= new PessoaFisica("Hiany Gabriely", "","");
		PessoaJuridica pj= new PessoaJuridica("Laura Santos", "", "");
		
		System.out.println("Nome:"+pf.getNome());
		pf.imprimirDados();
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Nome:"+pj.getNome());
		pj.imprimirDados();
	}
}
