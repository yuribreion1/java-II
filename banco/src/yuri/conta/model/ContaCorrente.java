package yuri.conta.model;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(String nome, double saldo, double taxa) {
		super(nome, saldo, taxa);
	}

	//Taxa para conta corrente
	public void atualiza(double taxa) {
		this.saldo += saldo * taxa * 2;
	}
}
