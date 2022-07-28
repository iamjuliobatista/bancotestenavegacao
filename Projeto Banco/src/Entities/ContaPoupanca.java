package Entities;

import java.time.LocalDate;
import java.util.Scanner;

public class ContaPoupanca extends Conta { public ContaPoupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	private int diaAniversarioPoupanca;
	private int dia;

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public void correcao () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a data atual:");
		dia = sc.nextInt();
		System.out.println("Informe a data de aniversario:");
		diaAniversarioPoupanca = sc.nextInt();
		
		if(diaAniversarioPoupanca == dia) {
			double correcao = getSaldo()* 0.05;
			credito(correcao);
			
			System.out.println("Alteração de +0,05% no saldo!");		//SUGESTAO DE MUDANCA
			System.out.println("Saldo Atual: " + getSaldo());			//SUGESTAO DE MUDANCA
			System.out.println("Saindo..."); 							//SUGESTAO DE MUDANCA
		} else {
			System.out.println("Saindo...");
		}
		

	}

	}
	

