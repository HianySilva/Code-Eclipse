import java.util.Scanner;

public class Numeros {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Escreva o 1� N�mero:");
		double Numero1=in.nextDouble();
		System.out.println("Escreva o 2� N�mero:");
		double Numero2=in.nextDouble();
		System.out.println("Escreva o 3� N�mero:");
		double Numero3=in.nextDouble();
		System.out.println("Escreva o 4� N�mero:");
		double Numero4=in.nextDouble();
		System.out.println("Escreva o 5� N�mero:");
		double Numero5=in.nextDouble();
		
		double Soma=(Numero1+Numero2+Numero3+Numero4+Numero5);
		System.out.println("Sua soma :"+Soma);
		double Media =(Soma)/5;
		System.out.println("Essa � a media:"+Media);
		
				
	}

}
