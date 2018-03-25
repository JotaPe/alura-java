package controller;

import model.Conta;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);
		System.out.println("Saldo primeira conta: " + primeiraConta.getSaldo());
		
	}
}
