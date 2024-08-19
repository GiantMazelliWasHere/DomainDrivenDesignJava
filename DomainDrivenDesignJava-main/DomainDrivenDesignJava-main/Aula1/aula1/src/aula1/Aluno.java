package aula1;

public class Aluno {
	String nome;
	short idade;
	String genero;
	String matricula;
	
	void estudar() {
		System.out.println("O aluno " + nome + " da idade " + idade + " e genero " + genero + " da matricula " + matricula + " esta estudando.");
	}
	
	void comer(String comida) {
		System.out.println("O aluno come " + comida);
	}
}
