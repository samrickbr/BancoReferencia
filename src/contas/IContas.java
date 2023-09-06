package contas;

public interface IContas {
	
	void depositar(double valor);

	void sacar(double valor);
	
	void transferir(double valor, IContas contaDestino);
	
	void imprimirExtrato();
}
