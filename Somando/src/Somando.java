
import java.util.Scanner;

public class Somando {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o valor de n:");
		 int n= in.nextInt();
		int controle=0;
		int[] somando=new int[n];
		int soma=0;
		int produto=1;
		 while(controle<n){
			 System.out.println("Informe o valor:");
			int valores= in.nextInt();
			somando[controle]=valores;
			controle++;
		 }
		 for (int i : somando) {
			 soma+=i;
			 produto*=i;
			 
			
		}
		 System.out.println(soma);
		 System.out.println(produto);
	}
	
	


}
