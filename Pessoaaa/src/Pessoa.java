
public class Pessoa {
	private int Id;
	private final int Cpf;
	private String Nome;
	
	Pessoa(int id, int cpf, String nome) {
	
		this.Id = id;
		this.Cpf = cpf;
		this.Nome = nome;
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCpf() {
		return Cpf;
	}
	
	
	
	
	

}
