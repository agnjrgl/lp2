public class Principal{
	public static void main(String []args){
		Exemplo e1 = new Exemplo();
		e1.inc();
		
		Exemplo e2 = new Exemplo();
		
		System.out.println(Exemplo.x);
		
		Exemplo e3 = new Exemplo();
		e3.inc();
		
		System.out.println(Exemplo.x);
		Exemplo.dec();
		System.out.println(Exemplo.x);
	}
}
