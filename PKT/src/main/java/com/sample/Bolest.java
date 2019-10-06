package com.sample;

//import java.util.Date;

public class Bolest {

	private String naziv;
	private String grupa; //za medjusobnu iskljucivost bolesti iz odredjenih grupa
	//private Date datum; //kad je bolest dijagnostikovana
	
	public Bolest() {
	}
	
	public Bolest(String naziv) {
		this.naziv = naziv;
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
	
	/*public Date getDatum() {
		return datum;
	}

	public void setDatum(Date d) {
		this.datum = d;
	}*/
}
