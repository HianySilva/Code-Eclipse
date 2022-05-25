
public class Pessoa {
    String nome;
    int anodoNascimento;
    final int cpf;
    double altura;
    
    Pessoa(String nome, int anodoNascimento, int cpf, double altura) {
		 
		 this.nome = nome;
		 this.anodoNascimento = anodoNascimento;
		 this.cpf = cpf;
		 this.altura = altura;
	}
    public void imprimirDados() {
    	System.out.println(this.nome);
		System.out.println(this.anodoNascimento);
		System.out.println(this.cpf);
		System.out.println(this.altura);
	}
	public int calcularIdade() {
		
		return 2021-this.anodoNascimento;
	}

}
