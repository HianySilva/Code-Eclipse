import java.util.ArrayList;
public class PrincipalPessoa {
	public static void main(String[]args) {
		ArrayList<Pessoa> ListaPessoa=new ArrayList<Pessoa>();
		Pessoa p1= new Pessoa(1,123,"Pri");
		Pessoa p2= new Pessoa(2,456,"Hiany");
		Pessoa p3= new Pessoa(3,789,"Luis");
		
		ListaPessoa.add(p1);
		ListaPessoa.add(p2);
		ListaPessoa.add(p3);
		
		for (Pessoa p: ListaPessoa) {
			System.out.println(p.getId());
			System.out.println(p.getCpf());
			System.out.println(p.getNome());
			
		}
	}
	

}
