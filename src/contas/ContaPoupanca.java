package contas;

import clientes.CadastroCliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(CadastroCliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
	}
}
