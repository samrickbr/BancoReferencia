package contas;

import clientes.CadastroCliente;

public abstract class Conta implements IContas {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int conta;
	protected double saldo;
	protected CadastroCliente cliente;

	public Conta(CadastroCliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void transferir(double valor, IContas contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
	}

	public void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNomeCliente()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

}
