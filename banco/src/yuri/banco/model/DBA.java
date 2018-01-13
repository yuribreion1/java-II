package yuri.banco.model;

public class DBA extends Funcionario {

	@Override
	double getBonus() {
		return this.salario * 0.09;
	}

}
