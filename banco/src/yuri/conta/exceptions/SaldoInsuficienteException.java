package yuri.conta.exceptions;

public class SaldoInsuficienteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double saldoAtual;

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public SaldoInsuficienteException(double saldoAtual) {
		super("Saldo insuficiente: " + saldoAtual);
		this.saldoAtual = saldoAtual;
	}

}
