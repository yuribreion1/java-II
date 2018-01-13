package yuri.conta.model;

public class ContaPoupanca extends Conta{

	public void atualiza(double taxa) {
		this.saldo += saldo * taxa * 3;
	}
	
	//Metodo especifico a conta poupanca
	public void deposita(double valorDepositado) {
		this.saldo += valorDepositado - 0.10;
	}
}
