package contas;

import clientes.CadastroCliente;

public class ContaCorrente extends Conta {

	public ContaCorrente(CadastroCliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
}
