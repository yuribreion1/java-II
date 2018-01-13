package yuri.banco.model;

import yuri.banco.interfaces.Autenticavel;

public class Cliente implements Autenticavel{
	String nome;
	String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public boolean autentica(String senha) {
		return false;
	}

}
