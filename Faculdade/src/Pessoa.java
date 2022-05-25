
public class Pessoa {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private int celular;
	
	public Pessoa(String nome, String cpf, String dataNascimento, int celular) {

		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.celular = celular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}
	public void trabalhar() {
		System.out.println("Trabalha");
	}
	
}
