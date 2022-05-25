package polimorfismo;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String cnpj) {
		super(nome, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public void imprimirDados() {
		System.out.println("CNPJ:765.489-0");
		System.out.println("Endereço:Rua-Luz do Sol");
	}
}
