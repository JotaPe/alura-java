package controller;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 300;
		conta.deposita(50);
		System.out.println(conta.saldo);
	}
}
