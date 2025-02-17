package br.com.fiap.rh.test;
import br.com.fiap.rh.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Test 1");
		lista.add("Test 2");
		
		for(String texto : lista) {
			System.out.println(texto);
		}
		
		Pessoa pessoa1 = new Pessoa("Edu", "11111", 25);
		Pessoa pessoa2 = new Pessoa("Josias", "5555", 20);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		
		for(Pessoa pessoa : pessoas) {
			pessoa.imprimir();
		}
		
		for(int i = 0; i<5; i++) {
			Pessoa pessoa = new Pessoa("Teste" + i, ""+i+i+i+i+i, i);
			pessoa.imprimir();
		}
		
		
	}
	
}
