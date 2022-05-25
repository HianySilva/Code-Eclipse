
public class AppCorrente {
	public static void main(String[]args) {
		ContaCorrente A= new ContaCorrente("014","234591-2",34);
	    //System.out.println("ContaCorrenteA: R$" +A.saldoconta());
		
		
		A.Creditar(A.saldo+ 1200);
		System.out.println("ContaCorrenteA");
		System.out.println("Agencia: 014");
		System.out.println("NºConta: 234591-2");
		System.out.println("Valor:R$"+A.saldoconta());
		
   	
		System.out.println();
		
		ContaCorrente B= new ContaCorrente("019","134589-1",50);
		//System.out.println("ContaCorrenteB:R$"  +B.saldoconta());
		
		
		B.Creditar(B.saldo+300);
		System.out.println("ContaCorrenteB:");
		System.out.println("Agencia: 019");
		System.out.println("NºConta: 134589-1");
		System.out.println("Valor:R$"+B.saldoconta());
	}

}
