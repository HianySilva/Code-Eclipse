
public class Conta {
	String numero;
	double saldo;
	
	Conta(String num,double valor) {
		numero= num;
		saldo= valor;
		
	}
	Conta(double saldo) {
		this.saldo=saldo;
		
	}
	public void Creditar(double valor) {
		saldo=valor;
	}
	public double saldoConta() {
		return saldo;
	}
	public void Creditaa(double saldo) {
		this.saldo=saldo;
	}
	

}
