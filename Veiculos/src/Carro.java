
public class Carro extends Veiculos{
	private boolean estadoAtual;
	private int velocidade;
	
	public Carro(String marca, String modelo, String ano, String cor, boolean estadoAtual,
			int velocidade) {
		super(marca, modelo, ano, cor);
		this.estadoAtual = estadoAtual;
		this.velocidade = velocidade;
	}

	public boolean isEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(boolean estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public boolean ligar() {
		this.estadoAtual=true;
		return this.estadoAtual;
	}
	public boolean desligar() {
		this.estadoAtual=false;
		return this.estadoAtual;
		
	}
	public int acelerar() {
		if(isEstadoAtual()) {
			this.velocidade+=10;
			
		}else {
			System.out.println("O veiculo está desligado");
			this.velocidade=0;
		}
		return this.velocidade;
		
	}
	public int freiar() {
		if (isEstadoAtual() && this.velocidade>0) {
			this.velocidade-=10;
			
		}else {
			System.out.println("O veiculo está parado");
			this.velocidade=0;
		}
		return this.velocidade;
	}

		
}


