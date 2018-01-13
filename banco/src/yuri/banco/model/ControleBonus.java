package yuri.banco.model;

public class ControleBonus {
	
	/*
	 * Aplicando conceitos de poliformismo que e a capacidade de o objeto 
	 * ser referenciado de varias formas
	 * */
	
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario f) {
		this.totalDeBonificacoes += 	f.getBonus();
	}
	
	public double getTotalBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
