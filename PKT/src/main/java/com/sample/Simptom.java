package com.sample;

public class Simptom {
	
	private String opis;
	private String vrsta; //specificni ili opsti
	
	public Simptom() {
	} 
	
	public Simptom(String opis, String vrsta) {
		this.opis = opis;
		this.vrsta = vrsta;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	} 

}
