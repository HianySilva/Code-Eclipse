package ProvaQ2;

public class Professor {
	private String nome;
	private String Formacao;
	
	public Professor(String nome, String formacao) {
		super();
		this.nome = nome;
		Formacao = formacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormacao() {
		return Formacao;
	}

	public void setFormacao(String formacao) {
		Formacao = formacao;
	}
	
	


}
