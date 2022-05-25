
public class Poupanca extends Conta {
	private double juros;

	public Poupanca(Cliente cliente, String numerodaconta, String agencia, double saldo, double juros) {
		super(cliente, numerodaconta, agencia, saldo);
		this.juros = juros;
	}
	
	

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public void renderJuros() {
		double saldo=this.getSaldo();
		
		
	}

}
