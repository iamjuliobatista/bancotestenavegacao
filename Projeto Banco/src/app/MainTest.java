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
		
//==============================================================================================================
//INICIO CONTA POUPANCA
		if (nav1.getContaSelect() == 1) {
			nav1.dadosConstrutor();
			ContaPoupanca pou = new ContaPoupanca(nav1.getNumeroConta(), nav1.getCpf(), 34); //FALTA ARRUMAR O ULTIMO PARAMETRO (ANIVERSARIO)
			do {
				nav1.escolherMov();
				
			if (nav1.getMovimentoEsco() == 1 && nav1.getContaSelect() == 1) {
					nav1.movDebito();
					pou.debito(nav1.getValorDebito());
				}
				
			if (nav1.getMovimentoEsco() == 2 && nav1.getContaSelect() == 1) {
					nav1.movCredito();
					pou.credito(nav1.getValorCredito());
				}
			
			if (nav1.getMovimentoEsco() == 3 && nav1.getContaSelect() == 1) {
				nav1.movSair();
				pou.correcao();
			}
				
			} while (nav1.getContaMovimentos() < 100 && nav1.getMovimentoEsco() != 3);
		}
//FIM CONTA POUPANCA		
//==============================================================================================================
//INICIO CONTA CORRENTE
			if (nav1.getContaSelect() == 2) {
				nav1.dadosConstrutor();
				ContaCorrente cor = new ContaCorrente(nav1.getNumeroConta(), nav1.getCpf());
				do {
					nav1.escolherMov();
					
				if (nav1.getMovimentoEsco() == 1 && nav1.getContaSelect() == 2) {
						nav1.movDebito();
						cor.debito(nav1.getValorDebito());
					}
					
				if (nav1.getMovimentoEsco() == 2 && nav1.getContaSelect() == 2) {
						nav1.movCredito();
						cor.credito(nav1.getValorCredito());
					}
				
				if (nav1.getMovimentoEsco() == 3 && nav1.getContaSelect() == 2) {
					nav1.movSair();
					cor.pedirTalao();
				}
					
				} while (nav1.getContaMovimentos() < 100 && nav1.getMovimentoEsco() != 3);
}			
//FIM CONTA CORRENTE		
//==============================================================================================================
//INICIO CONTA ESPECIAL
			if (nav1.getContaSelect() == 3) {
				nav1.dadosConstrutor();
				ContaEspecial esp = new ContaEspecial(nav1.getNumeroConta(), nav1.getCpf());
				do {
					nav1.escolherMov();
					
				if (nav1.getMovimentoEsco() == 1 && nav1.getContaSelect() == 3) {
						nav1.movDebito();
						esp.debito(nav1.getValorDebito());
					}
					
				if (nav1.getMovimentoEsco() == 2 && nav1.getContaSelect() == 3) {
						nav1.movCredito();
						esp.credito(nav1.getValorCredito());
					}
				
				if (nav1.getMovimentoEsco() == 3 && nav1.getContaSelect() == 3) {
					nav1.movSair();
					//SITUACAO DA CONTA FICAR ATIVA OU NAO, PAGAMENTO DE LIMITE
				}
					
				} while (nav1.getContaMovimentos() < 100 && nav1.getMovimentoEsco() != 3);
}		
//FIM CONTA ESPECIAL		
//==============================================================================================================	
//INICIO CONTA EMPRESA
			if (nav1.getContaSelect() == 4) {
				nav1.dadosConstrutor();
				ContaEmpresa emp = new ContaEmpresa(nav1.getNumeroConta(), nav1.getCpf());
				do {
					nav1.escolherMov();
					
				if (nav1.getMovimentoEsco() == 1 && nav1.getContaSelect() == 4) {
						nav1.movDebito();
						emp.debito(nav1.getValorDebito());
					}
					
				if (nav1.getMovimentoEsco() == 2 && nav1.getContaSelect() == 4) {
						nav1.movCredito();
						emp.credito(nav1.getValorCredito());
					}
				
				if (nav1.getMovimentoEsco() == 3 && nav1.getContaSelect() == 4) {
					nav1.movSair();
					//SITUACAO DA CONTA FICAR ATIVA OU NAO, PAGAMENTO DE EMPRESTIMO
				}
					
				} while (nav1.getContaMovimentos() < 100 && nav1.getMovimentoEsco() != 3);
}
//FIM CONTA EMPRESA
//==============================================================================================================
//INICIO CONTA ESTUDANTIL
			if (nav1.getContaSelect() == 5) {
				nav1.dadosConstrutor();
				ContaEstudantil est = new ContaEstudantil(nav1.getNumeroConta(), nav1.getCpf());
}
//FIM CONTA ESTUDANTIL
//==============================================================================================================			
	}
}
