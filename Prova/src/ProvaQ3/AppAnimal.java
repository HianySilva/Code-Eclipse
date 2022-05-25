package ProvaQ3;

public class AppAnimal {
	public static void main(String[] args) {
		Cachorro c=new Cachorro(null, null);
		c.nomeAnimal();
		c.caminhar();
		c.Falar();
		
		System.out.println("----------------------------------------");
		
		Gato g=new Gato(null,null);
		g.nomeAnimal();
		g.caminhar();
		g.Falar();
	}


}


