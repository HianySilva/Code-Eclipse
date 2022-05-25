package polimorfismo;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public void imprimirDados() {
		System.out.println("CPF:120.456.901-02");
		System.out.println("Endereço: Rua-José Luis de Melo");
		
	}
	

}
