package com.sample;

public class Lekar {
	
	private String ime;
	private String prezime;
	private Boolean dezura; 
	private String notifikacija;
	private String pacijent;
	
	public Lekar() {
	}
	
	public Lekar(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	} 

	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public Boolean getDezura() {
		return dezura;
	}
	
	public void setDezura(Boolean dezura) {
		this.dezura = dezura;
	}
	
	public String getNotifikacija() {
		return notifikacija;
	}
	public void setNotifikacija(String notifikacija) {
		this.notifikacija = notifikacija;
	}

	public String getPacijent() {
		return pacijent;
	}

	public void setPacijent(String pacijent) {
		this.pacijent = pacijent;
	}
	
	
}
