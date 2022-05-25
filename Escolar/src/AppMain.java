
public class AppMain {
	public static void main(String[] args) {
		 Aluno aluno=new Aluno();
		 
		 Disciplina disciplina1=new Disciplina();
		 Disciplina disciplina2= new Disciplina();
		 
		 Notas nota1=new Notas(10,8,7,6);
		 Notas  nota2=new Notas(9,7,7,6);
		 
		 disciplina1.setNotas(nota1);
		 disciplina2.setNotas(nota2);
		 aluno.getListaDisciplina().add(disciplina1);
		 aluno.getListaDisciplina().add(disciplina2);
		 
		 for ( Disciplina disciplina:aluno.getListaDisciplina()) {
			 System.out.println(disciplina.getNotas().calcularMedia());
			
		}
		 
	}

}
