
public class AppBanco {
	public static void main(String[]args) {
		
	
		Cliente cliente =new Cliente("Maria", "084.545.678-02");
		Conta c=new Conta(cliente, "123345", "012", 580.73);
		Poupanca p=new Poupanca(cliente, "1435678", "023", 4700.50, 0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(p.getSaldo());
	}
	

}
