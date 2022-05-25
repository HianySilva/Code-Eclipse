
public class Pessoa {
	String Nome;
	int AnodoNascimento;
	int Idade;
	double Altura;
	
	 Pessoa(String Nome,int AnodoNascimento,double Altura) {
		 this.Nome=Nome;
		 this.AnodoNascimento=AnodoNascimento;
		 this.Altura=Altura;
		 
	}
	public void ImprimirDados() {
		System.out.println(Nome);
		System.out.println(AnodoNascimento);
		System.out.println(Altura);
		
	}
	public void CalcularIdade() {
	 Idade= 2021-AnodoNascimento;
	 System.out.println(Idade);
	 
	}


}
