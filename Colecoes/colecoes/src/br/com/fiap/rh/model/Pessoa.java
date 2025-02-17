package br.com.fiap.rh.model;

import java.util.List;

public class Pessoa {
	
	private String nome;
	
	private String cpf;
	
	private int idade;
	
	private List<Endereco> enderecos;
	
	public Pessoa(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		
	}
	
	public void imprimir() {
		System.out.println("O nome da pessoa eh: " + this.nome + ". O CPF eh: " + this.cpf + ". Sua idade eh: " + this.idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
}
