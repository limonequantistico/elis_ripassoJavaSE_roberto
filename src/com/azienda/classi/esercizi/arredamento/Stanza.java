package com.azienda.classi.esercizi.arredamento;

public class Stanza {

	private String nome;
	private String colore;
	private float metriQuadri;
	private float altezza;

	public Stanza(String nome, String colore, float metriQuadri, float altezza) {
		this.nome = nome;
		this.colore = colore;
		this.metriQuadri = metriQuadri;
		this.altezza = altezza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public float getMetriQuadri() {
		return metriQuadri;
	}

	public void setMetriQuadri(float metriQuadri) {
		this.metriQuadri = metriQuadri;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public void incrementaMetriQuadri(float incremento) {
		setMetriQuadri(getMetriQuadri() + incremento);
	}

	public float incrementaAltezza(float incremento) {
		setAltezza(getAltezza() + incremento);
		return getAltezza();
	}

	public String stampaStanza() {
		return "Stanza [nome=" + nome + ", colore=" + colore + ", metriQuadri=" + metriQuadri + ", altezza=" + altezza
				+ "]";
	}

}
