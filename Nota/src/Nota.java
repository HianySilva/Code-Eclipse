
public class Nota {
	

	    private int matricula;
	    private String nome;
	    private double n1, n2, trabalho;
	    
	    Nota(int m, String n, double n1, double n2, double t){
	        matricula = m;
	        nome = n;
	        this.n1 = n1;
	        this.n2 = n2;
	        trabalho = t;
	    }
	    
	    public double media(){
	        return ((n1+n2)*2.5+trabalho*2)/7;
	    }
	    
	    public double aFinal(){
	        double media = media();
	        if(media<2.5 || media>=5)
	            return 0;
	            
	        return 10-media; 
	    }

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getN1() {
			return n1;
		}

		public void setN1(double n1) {
			this.n1 = n1;
		}

		public double getN2() {
			return n2;
		}

		public void setN2(double n2) {
			this.n2 = n2;
		}

		public double getTrabalho() {
			return trabalho;
		}

		public void setTrabalho(double trabalho) {
			this.trabalho = trabalho;
		}
	    
	}



