
public class ContaBancaria {
	String NomedoCliente;
	String Agencia;
	String N�daConta;
	double Saldo;
	
	ContaBancaria(String NomedoCliente,String Agencia,String N�daConta,double Saldo) {
		this.NomedoCliente=NomedoCliente;
		this.Agencia=Agencia;
		this.N�daConta=N�daConta;
		this.Saldo=Saldo;
		
	}
	public void Creditar(double Saldo) {
		 this.Saldo=Saldo;
		 
	}
	public void Debitar(double Saldo) {
		 this.Saldo=Saldo;
		 	
	}
	public double Saldoconta() {
		 return Saldo;
		
	}
	
}
