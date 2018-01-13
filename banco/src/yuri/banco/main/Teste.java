package yuri.banco.main;

import yuri.banco.model.ControleBonus;
import yuri.banco.model.Desenvolvedor;
import yuri.banco.model.Gerente;

public class Teste {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Desenvolvedor dev = new Desenvolvedor();
		ControleBonus controle = new ControleBonus();
		
		dev.setNome("Yuri Breion");
		dev.setSalario(5000);
		controle.registra(dev);
		
		gerente.setNome("Henrique");
		gerente.setSalario(8500);
		controle.registra(gerente);
		
		System.out.println("Total de bonus: " + controle.getTotalBonificacoes());
	
	}

}
