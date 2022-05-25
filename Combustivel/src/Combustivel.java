import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Informe a distancia a da sua viagem:");
		double distancia= in.nextDouble();
		System.out.println(" Seu Carro faz quantos km por litro de combustivel:");
		double combustivel=in.nextDouble();
		double media= distancia/combustivel;
		System.out.printf("Seu carro precisará :%.2f litros",media);
		

	}

}
