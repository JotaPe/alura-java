package controller;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 300;
		conta.deposita(50);
		System.out.println(conta.saldo);
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(500);
		System.out.println(conta2.saldo);
		conta2.transfere(300, conta);
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
		
	}
}
