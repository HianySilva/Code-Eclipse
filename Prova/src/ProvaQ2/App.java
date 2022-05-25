package ProvaQ2;

public class App {
	public static void main(String[] args) {
		Curso curso=new Curso();
		Disciplina disciplina1=new Disciplina();
		 Disciplina disciplina2= new Disciplina();
		 Professor p=new Professor("Leo", "Programador");
		 
		 disciplina1.setProfessor(p);
		 
		 disciplina2.setProfessor(p);
		curso.getListaDisciplinas().add(disciplina1);
		 curso.getListaDisciplinas().add(disciplina2);
		 
		 for ( Disciplina disciplina:curso.getListaDisciplinas()) {
			 System.out.println(disciplina.getProfessor());
			
		
	}
	
}

}



