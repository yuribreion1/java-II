package yuri.conta.model;

public class Conta {
	protected double saldo;
	protected double taxa;

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa ;
	}
	
	public void atualiza(double taxa) { 
		this.saldo += this.saldo * taxa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valorDepositado) {
		this.saldo += valorDepositado;
		System.out.println("Deposito de " + valorDepositado + " feito com sucesso!");
	}
	
	public void saca(double valorSacado) {
		this.saldo -= valorSacado;
		System.out.println("Saque de " + valorSacado + " feito com sucesso!\nUma taxa de " + taxa + " foi aplicada a transacao");
	}
}
