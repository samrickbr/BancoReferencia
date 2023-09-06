package banco;

import clientes.CadastroCliente;
import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		CadastroCliente ricardo = new CadastroCliente();
		ricardo.setNomeCliente("Ricardo");

		Conta cc = new ContaCorrente(ricardo);
		Conta poupanca = new ContaPoupanca(ricardo);

		cc.depositar(100);
		cc.transferir(73.25, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
