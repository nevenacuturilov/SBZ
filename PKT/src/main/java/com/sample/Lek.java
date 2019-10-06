package com.sample;

import java.util.ArrayList;

public class Lek {
	
	private String naziv;
	private String grupa; // antibiotici, analgetici i ostalo
	private ArrayList<String> sastojci;
	private Pacijent pacijent;
	
	public Lek() {
	}
	
	public Lek(String naziv, String grupa) {
		this.naziv = naziv;
		this.grupa = grupa;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGrupa() {
		return grupa;
	}

	public void setGrupa(String grupa) {
		this.grupa = grupa;
	}

	public ArrayList<String> getSastojci() {
		return sastojci;
	}

	public void setSastojci(ArrayList<String> sastojci) {
		this.sastojci = sastojci;
	}

	public Pacijent getPacijent() {
		return pacijent;
	}

	public void setPacijent(Pacijent pacijent) {
		this.pacijent = pacijent;
	}

}
