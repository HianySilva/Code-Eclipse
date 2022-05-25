
public class Conta {
	private Cliente cliente;
	private String numerodaconta;
	private String agencia;
	private double saldo;
	
	
	
	public Conta(Cliente cliente, String numerodaconta, String agencia, double saldo) {
		
		this.cliente = cliente;
		this.numerodaconta = numerodaconta;
		this.agencia = agencia;
		this.saldo = saldo;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public String getNumerodaconta() {
		return numerodaconta;
	}



	public void setNumerodaconta(String numerodaconta) {
		this.numerodaconta = numerodaconta;
	}



	public String getAgencia() {
		return agencia;
	}



	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
		
	
	
}
	
	