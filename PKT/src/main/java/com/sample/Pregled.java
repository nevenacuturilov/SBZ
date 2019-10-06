package com.sample;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pregled {
	
	private LocalDate datum; // datum kada je blest dijagnostikovana i kada je bio pregled
	private ArrayList<Simptom> simptomi;
	private Bolest bolest;
	private Lek lek; //to je terapija - treba spisak lekova
	
	public Pregled(LocalDate datum, ArrayList<Simptom> simptomi) {
		this.datum = datum;
		this.simptomi = simptomi;
	}
	
	public Boolean oduzimanjeDana(LocalDate ld, Integer i){
		
		//System.out.println("Hello from the time");
		
		Long l= new Long(i);
		
		LocalDate now = LocalDate.now();
		Boolean res = null;
	
		if(now.isAfter(ld)) {
			
    		//System.out.println("Now is after date");
    		LocalDate limit = now.minusDays(l);
    		
    		if(limit.isBefore(ld)) {
    			//System.out.println("Limit IS BEFORE ld");
    			res = true;
    			}
    		else
    			//System.out.println("Limit is not before ld");
    			res = false;
    	}
		else
			System.out.println("Pogresno unet datum!");
		
		return res;
		
	}
	
public Boolean oduzimanjeMeseci(LocalDate ld, Integer i){
		
		//System.out.println("Hello from the time");
	
		Long l= new Long(i);
		
		LocalDate now = LocalDate.now();
		Boolean res = null;
	
		if(now.isAfter(ld)) {
			
    		//System.out.println("Now is after date");
    		LocalDate limit = now.minusMonths(l);
    		
    		if(limit.isBefore(ld)) {
    			//System.out.println("Limit IS BEFORE ld");
    			res = true;
    			}
    		else
    			//System.out.println("Limit is not before ld");
    			res = false;
    	}
		else
			System.out.println("Pogresno unet datum!");
		
		return res;
		
	}

	public Boolean oduzimanjeGodina(LocalDate ld, Integer i){
	
	//System.out.println("Hello from the time");

	Long l= new Long(i);
	
	LocalDate now = LocalDate.now();
	Boolean res = null;

	if(now.isAfter(ld)) {
		
		//System.out.println("Now is after date");
		LocalDate limit = now.minusYears(l);
		
		if(limit.isBefore(ld)) {
			//System.out.println("Limit IS BEFORE ld");
			res = true;
			}
		else
			//System.out.println("Limit is not before ld");
			res = false;
	}
	else
		System.out.println("Pogresno unet datum!");
	
	return res;
	
}


	public LocalDate getDatum() {
		//
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public ArrayList<Simptom> getSimptomi() {
		return simptomi;
	}

	public void setSimptomi(ArrayList<Simptom> simptomi) {
		this.simptomi = simptomi;
	}

	public Bolest getBolest() {
		bolest = new Bolest();
		return bolest;
	}

	public void setBolest(Bolest bolest) {
		this.bolest = bolest;
	}

	public Lek getLek() {
		return lek;
	}

	public void setLek(Lek lek) {
		this.lek = lek;
	}

}
