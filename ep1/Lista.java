class No{
	private int x; No prox; No ant;
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return this.x;
	}

	public void setProx(No prox){
		this.prox = prox;
	}
	
	public No getProx(){
		return this.prox;
	}		

	public void setAnt(No ant){
		this.ant= ant;
	}
	
	public No getAnt(){
		return this.ant;
	}	
}

public class Lista{
	public	int tam=0;
	private No cabeca=null;
	private No cauda=null;
	
	public void setCabeca(No cabeca){
		this.cabeca = cabeca;
	}
	
	public No getCabeca(){
		return this.cabeca;
	}		

	public void setCauda(No cauda){
		this.cauda= cauda;
	}
	
	public No getCauda(){
		return this.cauda;
	}		
		
	public void Inserir(int valor){
        No aux = new No();
        aux.setX(valor);
        if(this.tam == 0){                  //se estiver vazio
            this.cabeca = aux;              //cabeca fixa
            this.cauda = aux;               //cauda inicia
            aux.setAnt(cabeca);  
            aux.setProx(cauda);  
        } else{
            this.cauda.setProx(aux);
            aux.setAnt(cauda);              //antiga cauda vira anterior
            this.cauda= aux;                //cauda mutavel, pois o elemento inserido eh no final
            cauda.setProx(cauda);
        }
        this.tam++;                         //tamanho aumenta
    }

	public void Remover(){
		No aux = getCabeca();				//auxiliar
		while (aux!=cauda){					//ele vai até o penúltimo valor
			aux = aux.getProx();
		}
		this.cauda=aux.getAnt();			//a cauda recebe o penúltimo
		this.tam--;
	}
		
	public boolean Procurar(int valor){
      No aux = getCabeca();                 //no auxiliar      
      while(aux != null){                   //percorrer a lista até chegar na cauda
         if(valor == aux.getX()){           //se achar algum valor na lista igual ao parametro
            return true;                    //retorna verdade
         }
         aux = aux.getProx();               //auxiliar percorrendo a lista
      }
      return false;                         //caso nao retorne nenhuma verdade, retorna falsidade
   }
	
	public void Exibir(){                   //para testes, auxiliar percorre a lista e vai escrevendo
		No aux = getCabeca();
		while (aux!=cauda){
			System.out.println(aux.getX());
			aux = aux.getProx();
		}
		System.out.println(cauda.getX());
	}
}
