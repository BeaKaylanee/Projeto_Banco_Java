package conta.repository;

import conta.model.Conta;

public interface ContaRepository {

	public void procurarPorNumero();
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void atualizar (Conta conta);
	public void deletar (int numero);
	
	public void sacr(int nuemro, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
}
