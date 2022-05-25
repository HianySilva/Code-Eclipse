package ProvaQ2;

import java.util.ArrayList;

public class Curso {
	private String nomeDocurso;
	private String matricula;
	private ArrayList <Disciplina> listaDisciplinas;
	
	public Curso() {
		listaDisciplinas=new ArrayList<Disciplina>();
	}

	public String getNomeDocurso() {
		return nomeDocurso;
	}

	public void setNomeDocurso(String nomeDocurso) {
		this.nomeDocurso = nomeDocurso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}

	public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}
	
		
	

}
