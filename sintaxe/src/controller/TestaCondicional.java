package controller;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
			System.out.println("Seja bem vindo!");
		} else if (quantidadePessoas >= 3) {
			System.out.println("Pode entrar pois esta acompanhado.");
		} else {
			System.out.println("Você não pode entrar, "
					+ "pois nem acompanhado você esta.");
		}
	}
}
