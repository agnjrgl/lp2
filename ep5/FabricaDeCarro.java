public class FabricaDeCarro{
	private static FabricaDeCarro instancia;
	private FabricaDeCarro(){
		
	}
	
	protected int nfiat;
	protected int nvolks;
	protected int nford;
	
	public static synchronized FabricaDeCarro getInstancia(){
		if(instancia==null)
			instancia=new FabricaDeCarro();
		return instancia;
	}
}
