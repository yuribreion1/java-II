package yuri.conta.main;

import yuri.conta.exceptions.DepositoInvalidoException;
import yuri.conta.exceptions.SaldoInsuficienteException;
import yuri.conta.model.AtualizadorDeContas;
import yuri.conta.model.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente("Edmilson", 500, 0.15);
		//ContaPoupanca cp = new ContaPoupanca("Mara", 5000, 0.16);
		AtualizadorDeContas adc = new AtualizadorDeContas("Yuri", 500, 0.1);

		try {
			cc.saca(1200);
		} catch (SaldoInsuficienteException e) {
			System.err.println("O saldo esta insuficiente: " + e.getSaldoAtual());
		} catch (Exception e) { 
			System.err.println("Outra Exception nao relacionada ao saldo");
		}
		
		try {
			cc.deposita(-500);
		} catch (DepositoInvalidoException e) {
			System.err.println("Valor depositado incorreto, favor refazer operacao: " + e.getValorDepositado());
		} catch (Exception e) { 
			System.err.println("Outra exception nao relacionada ao deposito");
		}
		
		cc.atualiza(0.01);

		//adc.roda(cc);
		//adc.roda(cp);

		System.out.println("==========================================\n"
				+ "Saldo total das contas com deducao de taxa selic: " + adc.getSaldoTotal());

	}

}
