package app;

import java.util.Scanner;

public class Navigation {
	private int contaSelect = 1;
	private String vetorContas[] = {"Invalido", "Conta Poupanca", "Conta Corrente", "Conta Especial", "Conta Empresa", "Conta Estudantil"};
	private int numeroConta = 0;
	private String cpf = "vazio";
	private int movimentoEsco = 1;
	private int contaMovimentos = 0;
	private int valorDebito;
	private int valorCredito;
	

	public int getContaSelect() {
		return contaSelect;
	}
	public void setContaSelect(int contaSelect) {
		this.contaSelect = contaSelect;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String[] getVetorContas() {
		return vetorContas;
	}
	public void setVetorContas(String[] vetorContas) {
		this.vetorContas = vetorContas;
	}
	public int getMovimentoEsco() {
		return movimentoEsco;
	}
	public void setMovimentoEsco(int movimentoEsco) {
		this.movimentoEsco = movimentoEsco;
	}
	public int getContaMovimentos() {
		return contaMovimentos;
	}
	public void setContaMovimentos(int contaMovimentos) {
		this.contaMovimentos = contaMovimentos;
	}
	public int getValorDebito() {
		return valorDebito;
	}
	public void setValorDebito(int valorDebito) {
		this.valorDebito = valorDebito;
	}
	public int getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}



	Scanner imput1 = new Scanner(System.in);
	
	
	
	void seletorConta (){
		System.out.println("Nirvana G6");							//APRESENTACAO
		System.out.println("Seu paraíso financeiro");				//APRESENTACAO
		
		do {															//LOOP DE VERIFICACAO DE RESPOSTA
			if (contaSelect != 1 && contaSelect != 2 && contaSelect != 3 &&
					contaSelect != 4 && contaSelect != 5 && contaSelect != 6) {				//CONDICAO SERA APRESENTADA EM CASO DE ERRO
				System.out.println("Erro, código inválido!");
				System.out.println("Tente novamente");
			}
			System.out.println("1 - CONTA POUPANÇA");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - CONTA ESTUDANTIL");
			System.out.println("6 - SAIR");
			System.out.print("Por favor, digite o código da opcao selecionada: ");
			contaSelect = imput1.nextInt();
			
		} while (contaSelect != 1 && contaSelect != 2 && contaSelect != 3 &&
				contaSelect != 4 && contaSelect != 5 && contaSelect != 6);
		
	}

	
	void contaApre() {
			if (contaSelect == 6) {
			System.out.println("Voce escolheu: Sair");					//APRESENTACAO
			System.out.println();
			System.out.println("Obrigado por utilizar o banco Nirvana G6!");
			System.out.println("Saindo...");							//APRESENTACAO
			System.exit(0);
		}
			System.out.println("Voce escolheu: " + vetorContas[contaSelect]);
			System.out.println();
			System.out.println("Nirvana G6");
			System.out.println("Seu paraíso financeiro");
			System.out.println(vetorContas[contaSelect]);						//APRESENTACAO
	}
	
	void dadosConstrutor() {
		System.out.print("Insira o numero da conta: ");				//DADOS PARA O CONSTRUTOR
		numeroConta = imput1.nextInt();
		System.out.print("Insira o CPF: ");
		cpf = imput1.next();											//DADOS PARA O CONSTRUTOR
		System.out.println("Saldo Atual: R$ 0,00");
	}
	
	void escolherMov() {
		do {
			if (movimentoEsco != 1 && movimentoEsco != 2) {
				System.out.println("Erro, código inválido!");
				System.out.println("Tente novamente");
			}
				System.out.println("1 - DÉBITO");
				System.out.println("2 - CRÉDITO");
				System.out.println("3 - CANCELAR/SAIR");
				System.out.print("Escolha o movimento que deseja realizar:");
				movimentoEsco = imput1.nextInt();
				
			} while (movimentoEsco != 1 && movimentoEsco != 2 && movimentoEsco != 3);
	}
	
	void movDebito() {
		contaMovimentos += 1;
		System.out.println("Voce escolheu: Débito");
		System.out.print("Digite o valor a ser debitado: ");
		valorDebito = imput1.nextInt();
	}
	
	void movCredito() {
		contaMovimentos += 1;
		System.out.println("Voce escolheu: Crédito");
		System.out.print("Digite a valor a ser creditado: ");
		valorCredito = imput1.nextInt();
	}
	
	void movSair() {
		System.out.println("Voce escolheu: Sair");
	}

}

