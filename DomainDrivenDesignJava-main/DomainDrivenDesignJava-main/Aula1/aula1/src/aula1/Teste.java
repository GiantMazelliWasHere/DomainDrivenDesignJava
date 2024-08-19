package aula1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Iniciando aqui....");
		
		Scanner entrada = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		aluno.nome = entrada.next();
		
		System.out.println("Digite o numero de matricula:");
		aluno.matricula = entrada.next();
		
		System.out.println("Digite sua idade:");
		aluno.idade = entrada.nextShort();
		
		System.out.println("Digite seu genero:");
		aluno.genero = entrada.next();
		
		aluno.estudar();
		aluno.comer("Salada");
		
		entrada.close();
		
		System.out.println("Finalizando aqui...");
		
		

	}

}
