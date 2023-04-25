package com.example.instrument.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instrument {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idInstrument;
	private String nomInstrument;
	private Double prixInstrument;
	private Date dateCreation;

	public Instrument() {
		super();
	}
	
	
	public Instrument(String nomProduit, Double prixProduit, Date dateCreation) {
		super();
		this.nomInstrument = nomInstrument;
		this.prixInstrument= prixInstrument;
		this.dateCreation = dateCreation;
	}


	public Long getIdProduit() {
		return idInstrument;
	}
	public void setIdProduit(Long idInstrument) {
		this.idInstrument = idInstrument;
	}
	public String getNomProduit() {
		return nomInstrument;
	}
	public void setNomProduit(String nomInstrument) {
		this.nomInstrument = nomInstrument;
	}
	public Double getPrixProduit() {
		return prixInstrument;
	}
	public void setPrixProduit(Double prixInstrument) {
		this.prixInstrument = prixInstrument;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "Produit [idInstrument=" + idInstrument + ", nomInstrument=" + nomInstrument + ", prixInstrument=" + prixInstrument
				+ ", dateCreation=" + dateCreation + "]";
	}
	
	

}
