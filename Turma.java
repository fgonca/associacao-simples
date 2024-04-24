/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Associação Simples
 * 		- Multiplicidade
 * 		- Navegabilidade
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.associacaosimples;

import java.util.ArrayList;

public class Turma 
{
	private String curso;
	private	ArrayList<Aluno> alunos; // referência aos alunos da turma
	public static final int  NUM_MAX_ALUNOS = 2; // constante
	
	public Turma(String curso) 
	{
		this.curso = curso;
		this.alunos = new ArrayList<Aluno>();
	}

	// obter o curso
	public String getCurso() 
	{
		return curso;
	}

	// obter os alunos
	public ArrayList<Aluno> getAlunos() 
	{
		return alunos;
	}

	public String matricularAluno(Aluno aluno) 
	{
		// 1- obter o número de alunos matriculados
		int numeroDeAlunosMatriculados = alunos.size();
		
		if(numeroDeAlunosMatriculados < NUM_MAX_ALUNOS) 
		{
			// 2- adicionar aluno
			alunos.add(aluno);
			
			// 3- definir a turma do aluno	
			aluno.setTurma(this);	
			
			return "Aluno matriculado!";
		}
		
		return "Aluno não matriculado! Turma cheia";				
    }
}
