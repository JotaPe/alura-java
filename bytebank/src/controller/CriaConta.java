package controller;

import model.Conta;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
	}
}
