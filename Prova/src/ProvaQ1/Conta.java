package ProvaQ1;

public class Conta {
	private String nome;
	private Agencia agencia;
	private double saldo;
	
	

	public Conta(String nome, Agencia agencia, double saldo) {
		super();
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

	
		
	



	
	
