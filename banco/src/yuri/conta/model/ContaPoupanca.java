package yuri.conta.model;

public class ContaPoupanca extends Conta{
	
	/**
	 * Classe filha de conta
	 * @author yuribreion
	 * @param nome
	 * @param saldo
	 * @param taxa
	 */

	public ContaPoupanca(String nome, double saldo, double taxa) {
		super(nome, saldo, taxa);		
	}

	public void atualiza(double taxa) {
		this.saldo += saldo * taxa * 3;
	}
	
	//Metodo especifico a conta poupanca
	public void deposita(double valorDepositado) {
		this.saldo += valorDepositado - 0.10;
	}

	@Override
	public boolean autentica(String senha) {
		return false;
	}
}
