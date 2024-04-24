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

public class Controle 
{
	public static void main(String[] args) 
	{
		/*
		 * 1- criar uma turma:
		 * o valor da variável turma é uma referência a um objecto do tipo Turma
		 */
		Turma turma = new Turma("Matemática");
		
		/*
		 * 2- criar um aluno:
		 * o valor da variável aluno é uma referência a um objecto do tipo Aluno
		 */
		Aluno aluno = new Aluno("Abel");
		
		// 3- matricular aluno
		String matricula = turma.matricularAluno(aluno);
		
		// 4- apresentar resultado da matrícula
		System.out.println(matricula);
		
		// criar mais um aluno, matriculá-lo e apresentar o resultado da matrícula
		Aluno aluno2 = new Aluno("Bela");
		System.out.println(turma.matricularAluno(aluno2));
		
		// 5- obter o curso
		String curso = turma.getCurso();
				
		// 6- apresentar o curso da turma
		System.out.println("\nCurso: " + curso);
		
		// 7- buscar cada aluno...
		for (Aluno alunoDaTurma: turma.getAlunos())
		{
			// 8- obter o nome do aluno matriculado na turma
			String nomeAluno = alunoDaTurma.getNome();
			
			// 9- apresentar o nome do aluno matriculado na turma
			System.out.println("  - " + nomeAluno);
		}
		
		// 10- obter o nome do aluno
		String nomeAluno = aluno.getNome();
		
		// 11- obter a turma do aluno
		Turma turmaDoAluno = aluno.getTurma();
		
		// 12- obter o curso da turma do aluno
		String cursoDaTurmaDoAluno = turmaDoAluno.getCurso();
		
		// 13- apresentar os dados do aluno
		System.out.printf("\n%s, %s\n", nomeAluno, cursoDaTurmaDoAluno);
		
		// obter os dados do aluno2 e apresertá-los
		String nomeAluno2 = aluno2.getNome();
		Turma turmaAluno2 = aluno2.getTurma();
		String cursoTurAluno2 = turmaAluno2.getCurso();
		System.out.printf("%s, %s\n", nomeAluno2, cursoTurAluno2);
		
		// tentar criar mais um aluno, matriculá-lo e apresentar o resultado da matrícula
		Aluno aluno3 = new Aluno("Carlos");
		System.out.println("\n" + turma.matricularAluno(aluno3));
		
	}
}
