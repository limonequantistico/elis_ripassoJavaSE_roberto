package com.azienda.classi.esercizi.banca;

public class ContoCorrente {

	private String numeroConto;
	private float saldo;
	private Banca banca;

	public ContoCorrente(String numeroConto, float saldo, Banca banca) {
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
	
	public String getNomeBanca() {
		if (banca != null) {
			return banca.getNome();
		}
		return "Nome non disponibile;";
	}
	
	public void setNomeBanca(String nome) {
		if (banca != null) {
			banca.setNome(nome);
		}
	}
	
	public String getCittaBanca() {
		if (banca != null && banca.getIndirizzo() != null) {
			return banca.getIndirizzo().getCitta();
		}
		return "Citta non disponibile;";
	}
	
	public void setCittaBanca(String citta) {
		if (this.banca != null && banca.getIndirizzo() != null) {
			banca.getIndirizzo().setCitta(citta);
		}
	}

}
