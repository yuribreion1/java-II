package yuri.banco.model;

public abstract class Funcionario {

	/*
	 * Super classe que extende a outros tipos especificos de funcionario Usando
	 * conceitos de heranca
	 */

	private String nome;
	private String cpf;
	protected double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	abstract double getBonus();
}
