
public class Endereco {
	private String rua;
	private String cidade;
	private String bairro;
	
	public Endereco(String rua, String cidade, String bairro) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	

}
