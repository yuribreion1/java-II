package yuri.conta.main;

import yuri.conta.model.AtualizadorDeContas;
import yuri.conta.model.Conta;
import yuri.conta.model.ContaCorrente;
import yuri.conta.model.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println("Saldo da conta: " + c.getSaldo());
		System.out.println("Saldo da conta 1 " + cc.getSaldo());
		System.out.println("Saldo da conta 2 " + cp.getSaldo());
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("==========================================\n"
				+ "Saldo total das contas com deducao de taxa selic: " + adc.getSaldoTotal());
		
	}

}
