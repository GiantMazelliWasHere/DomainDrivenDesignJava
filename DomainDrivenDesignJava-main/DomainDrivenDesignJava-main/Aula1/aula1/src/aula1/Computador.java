package aula1;

public class Computador {
	String modelo;
	short memoria;
	short hd;
	String procesador;
	String placaDeVideo;
	
	void ligar() {
		System.out.println("Ligando...");
	}
	
	void procesando() {
		System.out.println("Processando...");
	}
	
	void reiniciar() {
		System.out.println("Reiniciando...");
	}
	
	void desligar() {
		System.out.println("Desligando...");
	}
}
