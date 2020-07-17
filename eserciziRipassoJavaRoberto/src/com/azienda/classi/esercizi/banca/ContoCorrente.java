package com.azienda.classi.esercizi.banca;

public class ContoCorrente {

	private String numeroConto;
	private float saldo;
	private Banca banca;

	public ContoCorrente(String numeroConto, float saldo, Banca banca) {
		super();
		this.numeroConto = numeroConto;
		this.saldo = saldo;
		this.banca = banca;
	}

	public String getNumeroConto() {
		return numeroConto;
	}

	public void setNumeroConto(String numeroConto) {
		this.numeroConto = numeroConto;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Banca getBanca() {
		return banca;
	}

	public void setBanca(Banca banca) {
		this.banca = banca;
	}

	public String descrizione() {
		return "ContoCorrente [numeroConto=" + numeroConto + ", saldo=" + saldo + ", banca=" + banca.descrizione() + "]";
	}
	
	public void setCittaBanca(String citta) {
		if (this.banca != null && banca.getIndirizzo() != null) {
			banca.getIndirizzo().setCitta(citta);
		}
	}

}
