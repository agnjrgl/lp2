public class Principal{
	public static void main(String[] args){	
		Lista lista01 = new Lista();
		System.out.println("Adiciona-se 11, 12, 13, 14, 15, 16");
		lista01.Inserir(11);
		lista01.Inserir(12);
		lista01.Inserir(13);
		lista01.Inserir(14);
		lista01.Inserir(15);
		lista01.Inserir(16);
		System.out.println("Tamanho: "+lista01.tam);
		
		lista01.Exibir();
		
		if(lista01.Procurar(16)==true){
			System.out.println("Tem sim, senhor!");
		}
		
		System.out.println("remove o último, 16");
		
		lista01.Remover();
		
		System.out.println("Tamanho: "+lista01.tam);
		
		System.out.println("Adiciona-se 17");
		lista01.Inserir(17);
		lista01.Exibir();
		
		System.out.println("Tamanho: "+lista01.tam);
		
	}
}
