package yuri.conta.model;

public class AtualizadorDeContas extends Conta {
	public AtualizadorDeContas(String nome, double saldo, double taxa) {
		super(nome, saldo, taxa);
	}

	private double saldoTotal = 0;
	private double selic; 
	
	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo atualizado com a taxa selic: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
		
	}

	@Override
	public boolean autentica(String senha) {
		return false;
	}
	
}
