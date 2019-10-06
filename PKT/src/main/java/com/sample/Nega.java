package com.sample;

public class Nega {
	
	private Integer kiseonik; //nivo kiseonika
	private Integer srce; //otkucaji srca
	private Integer mokraca; //kolicina mokrace
	//PREMESTITI U DATE
	private Integer vreme; //kad se desilo to sto izazvalo notifikaciju
	
	public Nega(){
		
	} 

	public Integer getNivoKiseonika() {
		return kiseonik;
	}

	public void setNivoKiseonika(Integer nivoKiseonika) {
		this.kiseonik = nivoKiseonika;
	}

	public Integer getOtkucajiSrca() {
		return srce;
	}

	public void setOtkucajiSrca(Integer otkucajiSrca) {
		this.srce = otkucajiSrca;
	}

	public Integer getKolicinaMokrace() {
		return mokraca;
	}

	public void setKolicinaMokrace(Integer kolicinaMokrace) {
		this.mokraca = kolicinaMokrace;
	}

	public Integer getVremePromene() {
		return vreme;
	}

	public void setVremePromene(Integer vremePromene) {
		this.vreme = vremePromene;
	}
	
}
