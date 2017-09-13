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
		
		for(int i = 0; i < alunos.size(); i++){
			System.out.println(alunos.get(i).getNome()+" - "+alunos.get(i).getIdade());
		}

		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("LP2");
		disciplina1.setProfessor("Hebert");
		disciplinas.add(disciplina1);	

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Web");
		disciplina2.setProfessor("Marcelo");
		disciplinas.add(disciplina2);	
		
		ArrayList<Nota> notas = new ArrayList<Nota>();
		
		Nota nota1 = new Nota();
		nota1.setValor(0.7);
		nota1.setAluno(aluno1);
		nota1.setDisciplina(disciplina1);
		notas.add(nota1);
		
		Nota nota2 = new Nota();
		nota2.setValor(4.6);
		nota2.setAluno(aluno1);
		nota2.setDisciplina(disciplina2);
		notas.add(nota2);
		
		Nota nota3 = new Nota();
		nota3.setValor(8.1);
		nota3.setAluno(aluno2);
		nota3.setDisciplina(disciplina1);
		notas.add(nota3);
		
		Nota nota4 = new Nota();
		nota4.setValor(0.9);
		nota4.setAluno(aluno2);
		nota4.setDisciplina(disciplina2);
		notas.add(nota4);	
		
		Nota nota5 = new Nota();
		nota5.setValor(5.5);
		nota5.setAluno(aluno3);
		nota5.setDisciplina(disciplina1);
		notas.add(nota5);
		
		Nota nota6 = new Nota();
		nota6.setValor(5.7);
		nota6.setAluno(aluno3);
		nota6.setDisciplina(disciplina2);
		notas.add(nota6);		

		Nota nota7 = new Nota();
		nota7.setValor(3);
		nota7.setAluno(aluno4);
		nota7.setDisciplina(disciplina1);
		notas.add(nota7);
		
		Nota nota8 = new Nota();
		nota8.setValor(8.7);
		nota8.setAluno(aluno4);
		nota8.setDisciplina(disciplina2);
		notas.add(nota8);	

		Nota nota9 = new Nota();
		nota9.setValor(8.4);
		nota9.setAluno(aluno5);
		nota9.setDisciplina(disciplina1);
		notas.add(nota9);
		
		Nota nota10 = new Nota();
		nota10.setValor(6.2);
		nota10.setAluno(aluno5);
		nota10.setDisciplina(disciplina2);
		notas.add(nota10);	
		
		Collections.sort(notas);
		
		//Resposta1 Quem tirou maior nota?
		System.out.println(notas.get(0).getAluno().getNome()+" " +notas.get(0).getValor()+" "+notas.get(0).getDisciplina().getNome());
		
		//Resposta2 Maior nota em lp2
		int aux=2;
		int i=0;
		while (aux!=0){
			if(notas.get(i).getDisciplina().getNome().compareTo("LP2") == 0){
				System.out.println(notas.get(i).getAluno().getNome()+" "+notas.get(i).getValor());
				aux=0;
			}
			i++;
		}
	}
}
