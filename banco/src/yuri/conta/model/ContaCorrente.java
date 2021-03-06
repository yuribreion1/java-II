package yuri.conta.model;

public class ContaCorrente extends Conta{
	
	/**
	 * Classe filha de Conta
	 * @author yuribreion
	 * @param nome
	 * @param saldo
	 * @param taxa
	 */
	
	public ContaCorrente(String nome, double saldo, double taxa) {
		super(nome, saldo, taxa);
	}

	//Taxa para conta corrente
	public void atualiza(double taxa) {
		this.saldo += saldo * taxa * 2;
	}

	@Override
	public boolean autentica(String senha) {
		return false;
	}
}
