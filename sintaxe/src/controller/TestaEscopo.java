package controller;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		/*
		if (quantidadePessoas >= 2) {
			boolean acompanhado = true;
			//acompanhado morre
		} else {
			boolean acompanhado = false;
			//acompanhado morre
		}
		*/
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Você não pode entrar.");
			
		}
	}
}
