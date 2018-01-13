package yuri.conta.model;

public class ContaCorrente extends Conta{
	
	//Taxa para conta corrente
	public void atualiza(double taxa) {
		this.saldo += saldo * taxa * 2;
	}

}
