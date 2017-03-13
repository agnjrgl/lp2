import java.util.Arrays;

public class Aluno implements Comparable <Aluno>{
	private String nome;
	private int idade;
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public String getNome (){
		return this.nome;
	}

	public void setIdade (int idade){
		this.idade=idade;
	}
	
	public int getIdade (){
		return this.idade;
	}
	
	public int compareTo(Aluno outro){
		if(this.idade < outro.getIdade()){
			return 1;
		} else if(this.idade > outro.getIdade()){
			return -1;
		} else {
			return 0;
		}
	}
	
}
