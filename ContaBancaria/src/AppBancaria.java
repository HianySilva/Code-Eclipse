
public class AppBancaria {
	public static void main(String[]args) {
		ContaBancaria cb=new ContaBancaria("Lucas Guilherme", "023","43567-09",320);
		
		cb.Creditar(cb.Saldo+230);
		cb.Debitar(cb.Saldo-150);
		System.out.println("NomedoCliente: Lucas Guilherme");
		System.out.println("Agencia: 023");
		System.out.println("NºConta: 43567-09");
		System.out.println("Valor:R$"+cb.Saldoconta());
		
	}
	   

}
