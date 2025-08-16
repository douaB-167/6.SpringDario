package com.SpringDario.Biblioteca.models;

public class Libro {
	
	private int id;
	private String titolo;
	private int autore_id;
	private int anno_pubblicazione;
	private boolean disponibile;
	
	public Libro() {}
	
	public Libro(int  id, String titolo, int autore_id, int anno_pubblicazione, boolean disponibile) {
		this.id = id;
		this.titolo = titolo;
		this.autore_id = autore_id;
		this.anno_pubblicazione = anno_pubblicazione;
		this.disponibile = disponibile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAutore_id() {
		return autore_id;
	}

	public void setAutore_id(int autore_id) {
		this.autore_id = autore_id;
	}

	public int getAnno_pubblicazione() {
		return anno_pubblicazione;
	}

	public void setAnno_pubblicazione(int anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", autore_id=" + autore_id + ", anno_pubblicazione="
				+ anno_pubblicazione + ", disponibile=" + disponibile + "]";
	}

}
