package ProvaQ1;


public class AppConta {
	public static void main(String[] args) {
	ContaCorrente cc=new ContaCorrente("Hiany", null, 399)	;
	cc.Creditar(50);
	cc.Creditar(20);

	ContaPoupanca cp= new ContaPoupanca("José", null, 460);
	cp.Creditar(40);
	cp.debitar(20);
	
	
	
	Endereco endereco=new Endereco("Rua:Jose Luis de Melo", "Palmares", "Santo Antonio");
	System.out.println("Rua:"+endereco.getRua());
	System.out.println("Cidade:"+endereco.getCidade());
	System.out.println("Bairro:"+endereco.getBairro());
	
		
	}
	
}

    

