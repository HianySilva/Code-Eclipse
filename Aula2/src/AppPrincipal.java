
public class AppPrincipal {

	public static void main(String[] args) {
		Endereco endereco=new Endereco(	"Rua palmares", "Palmares", "Cohab");
		Imovel imovel=new Imovel("Lagoa grande","Galpão",endereco);
		Pessoa pessoa = new PessoaJuridica("Leo");
		pessoa.getListaImoveis().add(imovel);
		
		for (Imovel  imovel2 : pessoa.getListaImoveis()) {
			System.out.println(imovel2.getEndereco().getBairro());
			
		}
		//Pessoa pessoa1=new Pessoa("Robson", null);
	}

}
