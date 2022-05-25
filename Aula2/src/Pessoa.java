import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private ArrayList<Imovel>listaImoveis=new ArrayList<Imovel>();
	
	public Pessoa(String nome, ArrayList<Imovel> listaImoveis) {
		super();
		this.nome = nome;
		this.listaImoveis = listaImoveis;
	}
	

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Imovel> getListaImoveis() {
		return listaImoveis;
	}

	public void setListaImoveis(ArrayList<Imovel> listaImoveis) {
		this.listaImoveis = listaImoveis;
	}
	
		
}
