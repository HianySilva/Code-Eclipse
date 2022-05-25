
public class ContaBancaria {
	String NomedoCliente;
	String Agencia;
	String NºdaConta;
	double Saldo;
	
	ContaBancaria(String NomedoCliente,String Agencia,String NºdaConta,double Saldo) {
		this.NomedoCliente=NomedoCliente;
		this.Agencia=Agencia;
		this.NºdaConta=NºdaConta;
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
