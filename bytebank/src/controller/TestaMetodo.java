package controller;

import model.Conta;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(300);
		conta.deposita(50);
		System.out.println(conta.getSaldo());
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.getSaldo());
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(500);
		System.out.println(conta2.getSaldo());
		conta2.transfere(300, conta);
		System.out.println(conta2.getSaldo());
		System.out.println(conta.getSaldo());
		
	}
}
