package yuri.conta.main;

import yuri.conta.model.AtualizadorDeContas;
import yuri.conta.model.ContaCorrente;
import yuri.conta.model.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente("Edmilson", 1500, 0.15);
		ContaPoupanca cp = new ContaPoupanca("Mara", 5000, 0.16);
		AtualizadorDeContas adc = new AtualizadorDeContas("Yuri", 500, 0.1);

		cc.deposita(1000);
		cp.deposita(1000);

		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println("Saldo da conta 1 " + cc.getSaldo());
		System.out.println("Saldo da conta 2 " + cp.getSaldo());

		adc.roda(cc);
		adc.roda(cp);

		System.out.println("==========================================\n"
				+ "Saldo total das contas com deducao de taxa selic: " + adc.getSaldoTotal());

	}

}
