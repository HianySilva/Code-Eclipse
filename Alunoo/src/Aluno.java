
public class Aluno {
	private int matricula;
	private String nome;
	private double nota1 ,nota2;
	private double ntrabalho;
	
	Aluno(int matricula, String nome, double nota1, double nota2, double ntrabalho) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.ntrabalho = ntrabalho;
	}
	public double calcularMedia() {
		double media=(((getNota1()*2.5)+(getNota2()*2.5)+(getNtrabalho()*2))/(2.5+2.5+2));
		return media;
		
		
	}
	public void suaNota(double media) {
		if (media>6) {
			System.out.println("Você está Aprovado!");
			
		}else if(media<6){
			System.out.println("Você está na Prova final");
			
		
	
		
	   }
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNtrabalho() {
		return ntrabalho;
	}

	public void setNtrabalho(double ntrabalho) {
		this.ntrabalho = ntrabalho;
	}
		

}