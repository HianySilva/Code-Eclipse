
public class Disciplina {
	private String codigo;
	private String nome;
	private Notas notas;
	
	public Disciplina() {
		// TODO Auto-generated constructor stub
	}
	public Disciplina(String codigo, String nome, Notas notas) {
		this.codigo = codigo;
		this.nome = nome;
		this.notas = notas;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Notas getNotas() {
		return notas;
	}


	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	
}
	

