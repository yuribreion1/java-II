package yuri.conta.exceptions;

public class DepositoInvalidoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double valorDepositado;

	public double getValorDepositado() {
		return valorDepositado;
	}

	public DepositoInvalidoException(double valorDepositado) {
		super("Valor invalido a ser depositado, favor refazer operacao. Valor informado: " + valorDepositado);
		this.valorDepositado = valorDepositado;
	}

}
