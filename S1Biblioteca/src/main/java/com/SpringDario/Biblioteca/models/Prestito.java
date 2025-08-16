package com.SpringDario.Biblioteca.models;

import java.util.Date;

public class Prestito {

	private int id;
	private int libro_id;
	private Date data_prestito;
	private Date data_restituzione;
	
	public Prestito() {}
	
	public Prestito(int id, int libro_id, Date data_prestito, Date data_restituzione) {
		this.id = id;
		this.libro_id = libro_id;
		this.data_prestito = data_prestito;
		this.data_restituzione = data_restituzione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLibro_id() {
		return libro_id;
	}

	public void setLibro_id(int libro_id) {
		this.libro_id = libro_id;
	}

	public Date getData_prestito() {
		return data_prestito;
	}

	public void setData_prestito(Date data_prestito) {
		this.data_prestito = data_prestito;
	}

	public Date getData_restituzione() {
		return data_restituzione;
	}

	public void setData_restituzione(Date data_restituzione) {
		this.data_restituzione = data_restituzione;
	}

	@Override
	public String toString() {
		return "Prestito [id=" + id + ", libro_id=" + libro_id + ", data_prestito=" + data_prestito
				+ ", data_restituzione=" + data_restituzione + "]";
	}
	
}
