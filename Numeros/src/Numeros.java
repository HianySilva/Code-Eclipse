import java.util.Scanner;

public class Numeros {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Escreva o 1º Número:");
		double Numero1=in.nextDouble();
		System.out.println("Escreva o 2º Número:");
		double Numero2=in.nextDouble();
		System.out.println("Escreva o 3º Número:");
		double Numero3=in.nextDouble();
		System.out.println("Escreva o 4º Número:");
		double Numero4=in.nextDouble();
		System.out.println("Escreva o 5º Número:");
		double Numero5=in.nextDouble();
		
		double Soma=(Numero1+Numero2+Numero3+Numero4+Numero5);
		System.out.println("Sua soma :"+Soma);
		double Media =(Soma)/5;
		System.out.println("Essa é a media:"+Media);
		
				
	}

}
