package controller;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.nome = "João Pedro";
		joao.cpf = "222.222.222-22";
		joao.profissao = "Profissao";
		
		Conta joaoConta = new Conta();
		joaoConta.titular = joao;
		joaoConta.deposita(100);
		System.out.println(joaoConta.titular.nome);
		System.out.println(joaoConta.consulta());
	}
}