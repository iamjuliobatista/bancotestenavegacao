package app;

import Entities.ContaCorrente;
import Entities.ContaEmpresa;
import Entities.ContaEspecial;
import Entities.ContaEstudantil;
import Entities.ContaPoupanca;

public class MainTest {

	public static void main(String[] args) {
		
		Navigation nav1 = new Navigation();
		nav1.seletorConta();
		nav1.contaApre();
		nav1.dadosConstrutor();
		
		//INICIO DO BLOCO CONSTRUTOR
		ContaPoupanca pou = new ContaPoupanca(nav1.getNumeroConta(), nav1.getCpf(), 34); //FALTA ARRUMAR O ULTIMO PARAMETRO (ANIVERSARIO)
		ContaCorrente con = new ContaCorrente(nav1.getNumeroConta(), nav1.getCpf());
		ContaEspecial esp = new ContaEspecial(nav1.getNumeroConta(), nav1.getCpf());
		ContaEmpresa emp = new ContaEmpresa(nav1.getNumeroConta(), nav1.getCpf());
		ContaEstudantil est = new ContaEstudantil(nav1.getNumeroConta(), nav1.getCpf());
		//FIM DO BLOCO CONSTRUTOR

		if (nav1.getContaSelect() == 1 || nav1.getContaSelect() == 2) {						//MOVIMENTACOES DE DEBITO E CREDITO PARA
			do {																			//POUPANCA E CORRENTE QUE POSSUEM REGRAS
				nav1.escolherMov();															//SEMELHANTES
				
			if (nav1.getMovimentoEsco() == 1 && nav1.getContaSelect() == 1) {
					nav1.movDebito();
					pou.debito(nav1.getValorDebito());
				} else if (nav1.getMovimentoEsco() == 1 && nav1.getContaSelect() == 2) {
					nav1.movDebito();
					con.debito(nav1.getValorDebito());	
				}
				
			if (nav1.getMovimentoEsco() == 2 && nav1.getContaSelect() == 1) {
					nav1.movCredito();
					pou.credito(nav1.getValorCredito());
				} else if (nav1.getMovimentoEsco() == 2 && nav1.getContaSelect() == 2) {
					nav1.movCredito();
					con.credito(nav1.getValorCredito());
				}
			
			if (nav1.getMovimentoEsco() == 3 && nav1.getContaSelect() == 1) {
				nav1.movSair();
				pou.correcao();
			} else if (nav1.getMovimentoEsco() == 3 && nav1.getContaSelect() == 2) {
				nav1.movSair();
				con.pedirTalao();
			}
				
			} while (nav1.getContaMovimentos() < 100 && nav1.getMovimentoEsco() != 3);
			
		}
		
		
		
		
		
	}

}
