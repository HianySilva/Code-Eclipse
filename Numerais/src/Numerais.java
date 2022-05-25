import java.util.Scanner;

public class Numerais {
	public static void main(String[]args) {
		int[] vetor= {0,0,0,0,0};
		int valores;
		Scanner in= new Scanner(System.in);
		for(int n=0;n<5;n++) {
			System.out.println("Digite um numero:");
			valores=in.nextInt();
			vetor[n]=valores;
		}
		for (int i : vetor) {
			System.out.println("");
			if (i%2==0) {
				System.out.printf("O numero %d é Par",i);
			}else {
				System.out.printf("O numero %d é Ímpar",i);
			}
		}
	}
}
		


		