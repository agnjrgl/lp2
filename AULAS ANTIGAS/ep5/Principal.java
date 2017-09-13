public class Principal{
	public static void main(String args []){
		FabricaDeCarro f2=FabricaDeCarro.getInstancia();
		FabricaDeCarro f3=FabricaDeCarro.getInstancia();
		f2.nfiat=+10;
		System.out.println(f3.nfiat);
	}
}
