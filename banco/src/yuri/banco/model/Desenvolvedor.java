package yuri.banco.model;

public class Desenvolvedor extends Funcionario {
	
	//Bonificacao do desenvolvedor
	public double getBonus() {
		return this.salario * 0.25;
	}
}
