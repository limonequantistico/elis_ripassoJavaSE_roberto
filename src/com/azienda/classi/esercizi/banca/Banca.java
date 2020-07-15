package com.azienda.classi.esercizi.banca;

public class Banca {

	private String nome;
	private Indirizzo indirizzo;

	public Banca(String nome, Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		if (this.nome != null) {
			return nome;
		}
		return "Nome non disponibile";
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		} else {
			System.out.println("Inserire un nome valido.");
		}
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String descrizione() {
		return "Banca [nome=" + nome + ", indirizzo=" + indirizzo.descrizione() + "]";
	}

	public String getCittaBanca() {
		if (this.nome != null && this.indirizzo != null) {
			return indirizzo.getCitta();
		}
		return "Informazione non disponibile";
	}

}
