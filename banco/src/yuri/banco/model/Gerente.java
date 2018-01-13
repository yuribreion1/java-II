package yuri.banco.model;

public class Gerente extends Funcionario{
	protected int senha;
	protected int numeroDeFuncionarios;
	
	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	//Gerente de bonificacao
	public double getBonus() {
		return this.salario * 0.4;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}
	
}
