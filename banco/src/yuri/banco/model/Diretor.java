package yuri.banco.model;

import yuri.banco.interfaces.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel{

	@Override
	double getBonus() {
		return this.salario * 0.35;
	}

	@Override
	public boolean autentica(String senha) {
		return false; //regra de negocio
	}

}
