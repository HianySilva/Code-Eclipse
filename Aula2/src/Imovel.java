
public class Imovel {
	private String nome;
	private String type;
	private Endereco endereco;
	
	public Imovel(String nome, String type, Endereco endereco) {
		
		this.nome = nome;
		this.type = type;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
