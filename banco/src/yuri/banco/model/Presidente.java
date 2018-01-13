package yuri.banco.model;

public class Presidente extends Funcionario {

	@Override
	double getBonus() {
		return this.salario * 0.45;
	}

}
