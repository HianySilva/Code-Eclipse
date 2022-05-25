
public class Aluno extends Pessoa {
	private String matricula;
	private String curso;
	private int anoIngresso;
	
	public Aluno(String nome, String cpf, String dataNascimento, int celular, String matricula, String curso,
			int anoIngresso) {
		super(nome, cpf, dataNascimento, celular);
		this.matricula = matricula;
		this.curso = curso;
		this.anoIngresso = anoIngresso;
	}
	

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public int getAnoIngresso() {
		return anoIngresso;
	}


	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}


	public void dadosAluno() {
		System.out.println("Nome:"+getNome());
		System.out.println("Cpf:"+getCpf());
		System.out.println("Data do Nascimento:"+getDataNascimento());
		System.out.println("Celular:"+getCelular());
		System.out.println("Matricula:"+getMatricula());
		System.out.println("Curso:"+getCurso());
		System.out.println("Ano do Ingresso:"+getAnoIngresso());
	}
	
	

}
