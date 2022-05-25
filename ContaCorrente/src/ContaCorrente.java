
public class ContaCorrente {
	String agencia;
	String numeroconta;
	double saldo;
	
	
	 ContaCorrente(String agencia,String numeroconta, double saldo) {
		 this.agencia=agencia;
		 this.numeroconta=numeroconta;
		 this.saldo=saldo;
		 
	}
	 public void Creditar(double saldo) {
		 this.saldo=saldo;
		 
	}
	 public double saldoconta() {
		 return saldo;
		
	}

}
