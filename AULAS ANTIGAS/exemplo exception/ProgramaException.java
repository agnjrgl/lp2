public class ProgramaException{
	private int variavel;
	
	public static void main (String [] args){
		testeException1();
		testeException2();
		testeException3();
		//testeException4();
		
	} 
	
	public static void testeException1(){
		int[] vetor1 = new int[5];
		System.out.println("Teste Exception 1");
		try{
			vetor1[6]=10;
			System.out.println("Teste Exception 1 - Apos o erro");
		}
		catch(Exception e){
			System.out.println("Um erro ocorreu e este erro foi");
			e.printStackTrace();
		}
	}
	
	public static void testeException2(){
		int[] vetor1 = new int[5];
		System.out.println("Teste Exception 2");
		try{
			vetor1[6]=10;
			System.out.println("Teste Exception 2 - Apos o erro");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Um erro ocorreu de ArrayIndexOutOfBounds");
		}
	}
	
	public static void testeException3(){
		int[] vetor1 = new int[5];
		System.out.println("Teste Exception 3");
		try{
			vetor1[6]=10;
			System.out.println("Teste Exception 3 - Apos o erro");
		}
		catch(NullPointerException e){
			System.out.println("Um erro ocorreu de NullPointerExcetion");
		}
		finally{
			System.out.println("Teste Excetion 3 - Apos o catch");
		}
	}
	
}
