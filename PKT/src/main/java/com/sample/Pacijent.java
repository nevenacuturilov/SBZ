package com.sample;

import java.util.ArrayList;

public class Pacijent {
	
	//OPSTE
	private String ime;
	private String prezime;
	private ArrayList<Pregled> pregledi;
	private ArrayList<Bolest> bolesti = new ArrayList<Bolest>();// lista bolesti od kojih je pacijent u proslosti bolovao
	private ArrayList<Lek> lekovi;// lista lekova koji su pacijentu prepisani u proslosti
	private ArrayList<Lek> alergican; //spisak lekova na koje je pacijent alirgican
	private Lekar lekar;
	
	//MONITORING
	private Boolean zadrzan;
	//private Nega n;
	private Integer kiseonik;
	private Integer srce;
	private Integer mokraca;
	//Date?
	private Integer s;
	private Integer m;
	private Integer h;
	
	//IZVESTAVANJE

	public Pacijent(){
	}
	
	public Pacijent(String ime, String prezime, ArrayList<Pregled> pregledi) {
		this.ime = ime;
		this.prezime = prezime;
		this.pregledi = pregledi;
	}
	
	/*public Pacijent(String ime, String prezime, Nega n) {
		this.ime = ime;
		this.prezime = prezime;
		this.n = n;
	}*/
	
	public Pacijent(String ime, String prezime) {
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

	public ArrayList<Pregled> getPregledi() {
		return pregledi;
	}

	public void setPregledi(ArrayList<Pregled> pregledi) {
		this.pregledi = pregledi;
	}

	public ArrayList<Bolest> getBolesti() {
		return bolesti;
	}

	public void setBolesti(ArrayList<Bolest> bolesti) {
		this.bolesti = bolesti;
	}
	
	public void addBolest(String ime) {
		//this.bolesti = new ArrayList<Bolest>();
		Bolest b = new Bolest();
		b.setNaziv(ime);
		this.bolesti.add(b);
	}
	
	public void printBolesti() {
		for(int i=0; i < bolesti.size(); i++) {
			System.out.println("Bolesti: " + bolesti.get(i).getNaziv() + " ");
		}
	}

	public ArrayList<Lek> getLekovi() {
		return lekovi;
	}

	public void setLekovi(ArrayList<Lek> lekovi) {
		this.lekovi = lekovi;
	}
	
	public void addLek(String ime) {
	}
	
	public ArrayList<Lek> getAlergican() {
		return alergican;
	}

	public void setAlergican(ArrayList<Lek> alergican) {
		this.alergican = alergican;
	}

	public void addLekNaKojiJeAlergican(String ime) {
	}
	
	public Lekar getLekar() {
		return lekar;
	}

	public void setLekar(Lekar lekar) {
		this.lekar = lekar;
	}

	public Boolean getZadrzan() {
		return zadrzan;
	}

	public void setZadrzan(Boolean zadrzan) {
		this.zadrzan = zadrzan;
	}
	
	/*public Nega getN() {
	return n;
	}
	
	public void setN(Nega n) {
		this.n = n;
	}*/

	public Integer getKiseonik() {
		return kiseonik;
	}

	public void setKiseonik(Integer kiseonik) {
		this.kiseonik = kiseonik;
	}

	public Integer getSrce() {
		return srce;
	}

	public void setSrce(Integer srce) {
		this.srce = srce;
	}

	public Integer getMokraca() {
		return mokraca;
	}

	public void setMokraca(Integer mokraca) {
		this.mokraca = mokraca;
	}

	public Integer getS() {
		return s;
	}

	public void setS(Integer s) {
		this.s = s;
	}

	public Integer getM() {
		return m;
	}

	public void setM(Integer m) {
		this.m = m;
	}

	public Integer getH() {
		return h;
	}

	public void setH(Integer h) {
		this.h = h;
	}
}
