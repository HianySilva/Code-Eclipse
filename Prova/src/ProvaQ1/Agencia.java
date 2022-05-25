package ProvaQ1;

public class Agencia {
	private String numeroDaConta;
	private String nome;
	private Endereco endereco;
	
	public Agencia(String numeroDaConta, String nome, Endereco endereco) {
		
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}
