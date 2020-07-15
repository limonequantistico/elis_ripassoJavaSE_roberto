package com.azienda.classi.esercizi.banca;

public class Indirizzo {

	private String citta;
	private String stradaPiazza;
	private int numeroCivico;

	public Indirizzo(String citta, String stradaPiazza, int numeroCivico) {
		super();
		this.citta = citta;
		this.stradaPiazza = stradaPiazza;
		this.numeroCivico = numeroCivico;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getStradaPiazza() {
		return stradaPiazza;
	}

	public void setStradaPiazza(String stradaPiazza) {
		this.stradaPiazza = stradaPiazza;
	}

	public int getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String descrizione() {
		return "Indirizzo [citta=" + citta + ", stradaPiazza=" + stradaPiazza + ", numeroCivico=" + numeroCivico + "]";
	}

}
