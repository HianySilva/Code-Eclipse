package projeto;

	//Classe pai:
	public class Veiculos {
	    //Atributos:
		private String marca;
		private String modelo;
		private String ano;
		private String cor;
		
		//Construtor:
		public Veiculos(String marca, String modelo, String ano, String cor) {
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
			this.cor = cor;	
		}

		//Metodos:
		public String getMarca() {
			return marca;
		}
		
		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getAno() {
			return ano;
		}

		public void setAno(String ano) {
			this.ano = ano;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

	}


