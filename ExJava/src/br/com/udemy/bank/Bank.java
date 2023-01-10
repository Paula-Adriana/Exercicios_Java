package br.com.udemy.bank;

public class Bank {
	
	private final String numeroConta;
	private String nomeTitular;
	private double saldo = 0.0;
	private final int TAXA = 5;
	
	
	public Bank() {
		this.numeroConta = "";
	}

	public Bank(String numeroConta, String nomeTitular) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public Bank(String numeroConta, String nomeTitular, double depositoInicial) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double deposito(double deposito) {
		return saldo += deposito;
	}
	
	public void  saque(double saque) {
		saldo -= saque + TAXA;
	}
	
	@Override
	public String toString() {
		return "Número da conta: " + numeroConta
				+", Nome do titular: " + nomeTitular
				+", Saldo: " + saldo;
	}
	
	
	
}
