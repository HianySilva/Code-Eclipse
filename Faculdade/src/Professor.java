
public class Professor extends Pessoa {
	 private String formacao;
	 private String area;
	
	public Professor(String nome, String cpf, String dataNascimento, int celular, String formacao, String area) {
		super(nome, cpf, dataNascimento, celular);
		this.formacao = formacao;
		this.area = area;
	}
	
	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void dadosProfessor() {
		System.out.println("Nome:"+getNome());
		System.out.println("Cpf:"+getCpf());
		System.out.println("Data do Nascimento:"+getDataNascimento());
		System.out.println("Celular:"+getCelular());
		System.out.println("Formação:"+getFormacao());
		System.out.println("Area:"+getArea());
	}
	
	

}
