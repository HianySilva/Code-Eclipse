
public class AppPrincipal {

	public static void main(String[] args) {
		Professor p=new Professor("Leonardo","87745552", "1970", 986652345, "POO","Programador");
		p.dadosProfessor();
		p.trabalhar();
		System.out.println();
		Aluno a=new Aluno("Hiany", "021673456", "2001", 92345678, "76543", "IPI", 2020);
		a.dadosAluno();
		
		        


	}

}
