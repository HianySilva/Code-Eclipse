
public class Pessoa {
	private String nome;
	private int idade;
	private int cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void falar() {
	 System.out.println("Falando no IFPE");
	}
	public void escreverNome() {
		System.out.println(nome);
	}
}
	


	
