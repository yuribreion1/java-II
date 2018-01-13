package yuri.banco.model;

import yuri.banco.interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	protected int numeroDeFuncionarios;

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	// Gerente de bonificacao
	public double getBonus() {
		return this.salario * 0.4;
	}

	@Override
	public boolean autentica(String senha) {
		return false; //regra de negocio
	}

}
