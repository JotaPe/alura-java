package controller;

import model.Cliente;
import model.Conta;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("João Pedro");
		joao.setCpf("222.222.222-22");
		joao.setProfissao("Profissao");
		
		Conta joaoConta = new Conta();
		joaoConta.setTitular(joao);
		joaoConta.deposita(100);
		System.out.println(joaoConta.getTitular().getNome());
		System.out.println(joaoConta.consulta());
	}
}