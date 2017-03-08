import java.util.ArrayList;
import java.util.Collections;

public class Principal{
	public static void main(String[] args){	
		
		//declarando a arraylist do tipo Aluno
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		//adicionando 5 objetos
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Wagner");
		aluno1.setIdade(16);
		alunos.add(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Christian");
		aluno2.setIdade(34);
		alunos.add(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Adrienne");
		aluno3.setIdade(4);
		alunos.add(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Gabriel");
		aluno4.setIdade(84);
		alunos.add(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.setNome("Junior");
		aluno5.setIdade(19);
		alunos.add(aluno5);	
		
			
		Collections.sort(alunos);
		for(int i=0; i<alunos.size(); i++){
			System.out.println(alunos.get(i).getNome());
		}
	}
}
