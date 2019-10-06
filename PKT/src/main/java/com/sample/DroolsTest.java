package com.sample;

import java.time.LocalDate;
import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
        	
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	//DIJAGNOZA
        	
        	String ime11 = "Vasa";	
        	String prezime11 = "Vasic";
        	
        	Simptom sim111 = new Simptom("Curenje iz nosa", "");
        	Simptom sim112 = new Simptom("Bol u grlu", "");
        	Simptom sim113 = new Simptom("Glavobolja", "");
        	Simptom sim114 = new Simptom("Kijanje", "");
        	Simptom sim115 = new Simptom("Kasalj", "");
        	
        	ArrayList<Simptom> simptomi11 = new ArrayList<>();
        	
        	simptomi11.add(sim111);
        	simptomi11.add(sim112);
        	simptomi11.add(sim113);
        	simptomi11.add(sim114);
        	simptomi11.add(sim115);
        	
			LocalDate datum11 = LocalDate.of(2017,1,15);
        	
        	Pregled pregled11 = new Pregled(datum11, simptomi11);
        	
        	ArrayList<Pregled> pregledi11 = new ArrayList<>();
        	
        	pregledi11.add(pregled11);
        	
        	Pacijent pacijent11 = new Pacijent(ime11, prezime11, pregledi11);
        	
        	
        	/*LocalDate now = LocalDate.now();
        	System.out.println(now.toString());
        	
        	LocalDate da = LocalDate.of(2019,4,13);
        	System.out.println(da.toString());
        	
        	LocalDate limit = now.minusDays(60);
    		
    		if(limit.isBefore(da)) {
    			System.out.println("Limit IS BEFORE ld");
    			
    			}
    		else
    			System.out.println("Limit is not before ld");*/
        	
        	
        	String ime14 = "Tina";	
        	String prezime14 = "Tin";
        	
        	Simptom sim141 = new Simptom("Oticanje oko ociju", "");
        	Simptom sim142 = new Simptom("Glavobolja", "");
        	Simptom sim143 = new Simptom("Zuti sekret iz nosa", "");
        	Simptom sim144 = new Simptom("Bol u grlu", "");
        	Simptom sim145 = new Simptom("Temperatura veca od 38", "");
        	Simptom sim146 = new Simptom("Kasalj", "");
        	
        	ArrayList<Simptom> simptomi14 = new ArrayList<>();
        	
        	simptomi14.add(sim141);
        	simptomi14.add(sim142);
        	simptomi14.add(sim143);
        	simptomi14.add(sim144);
        	simptomi14.add(sim145);
        	simptomi14.add(sim146);
        	
        	LocalDate datum14 = LocalDate.of(2019,4,13);
        	
        	Pregled pregled14 = new Pregled(datum14, simptomi14);
        	
        	ArrayList<Pregled> pregledi14 = new ArrayList<>();
        	
        	pregledi14.add(pregled14);
        	
        	Pacijent pacijent14 = new Pacijent(ime14, prezime14, pregledi14);
        	
        	pacijent14.addBolest("Groznica");
        	
        	
        	String ime22 = "Mita";
        	String prezime22 = "Mitic";
        	
        	Simptom sim221 = new Simptom("Cesto uriniranje", "");
        	Simptom sim222 = new Simptom("Gubitak telesne tezine", "");
        	Simptom sim223 = new Simptom("Zamor", "");
        	Simptom sim224 = new Simptom("Mucnina i povracanje", "");
        	
        	ArrayList<Simptom> simptomi22 = new ArrayList<>();
        	
        	simptomi22.add(sim221);
        	simptomi22.add(sim222);
        	simptomi22.add(sim223);
        	simptomi22.add(sim224);
        	
        	LocalDate datum22 = LocalDate.of(2017,5,17);
        
        	Pregled pregled22 = new Pregled(datum22, simptomi22);
        	
        	ArrayList<Pregled> pregledi22 = new ArrayList<>();
        	
        	pregledi22.add(pregled22);
        	
        	Pacijent pacijent22 = new Pacijent(ime22, prezime22, pregledi22);
        	
        	
        	String imen31 = "Zika";
        	String prezimen31 = "Zikic";
        	
        	Simptom sim311 = new Simptom("Zamor", "");
        	Simptom sim312 = new Simptom("Nocturia", "");
        	Simptom sim313 = new Simptom("Otoci nogu i zglobova", "");
        	Simptom sim314 = new Simptom("Gusenje", "");
        	Simptom sim315 = new Simptom("Bol u grudima", "");
        	
        	ArrayList<Simptom> simptomi31 = new ArrayList<>();
        	
        	simptomi31.add(sim311);
        	simptomi31.add(sim312);
        	simptomi31.add(sim313);
        	simptomi31.add(sim314);
        	simptomi31.add(sim315);
        	
			LocalDate datum31 = LocalDate.of(2018,6,20);
        	
        	Pregled pregled31 = new Pregled(datum31, simptomi31);
        	
        	ArrayList<Pregled> pregledi31 = new ArrayList<>();
        	
        	pregledi31.add(pregled31);
        	
        	Pacijent pacijentn31 = new Pacijent(imen31, prezimen31, pregledi31);
        	
        	pacijentn31.addBolest("Dijabetis");
        	pacijentn31.addBolest("Hipertenzija");
        	
        	pacijentn31.printBolesti();
        	
        	//MOTIRONG
        	
        	/*Nega nega = new Nega();
        	nega.setNivoKiseonika(28);
        	nega.setVremePromene(5);*/
        	
        	//Nega nega = new Nega(28, 5);
        	
        	String imen1 = "Mare";
        	String prezimen1 = "Maric";
        	
        	Pacijent pacijentn1 = new Pacijent(imen1, prezimen1);
        	pacijentn1.setKiseonik(28);
        	pacijentn1.setM(5);
        	
        	String imen2 = "Lena";
        	String prezimen2 = "Lenov";
        	
        	Pacijent pacijentn2 = new Pacijent(imen2, prezimen2);
        	pacijentn2.setSrce(58);
        	pacijentn2.setS(6);
        	
        	
        	pacijentn31.setSrce(12);
        	pacijentn31.setS(8);
        	pacijentn31.setMokraca(98);
        	pacijentn31.setH(2);
        	
        	
        	String imel = "Leka";
        	String prezimel = "Lekic";
        	
        	Lekar l = new Lekar(imel, prezimel);
        	l.setDezura(true);
        	

        	kSession.insert(pacijent11); //Prehlada
        	kSession.insert(pacijent14); //Sinusna infekcija
            kSession.insert(pacijent22); //Dijabetis
            kSession.insert(pacijentn31); //Hronicna bubrezna bolest i hitno potrebna dijaliza
            
            kSession.insert(pacijentn1); //Problemi sa kiseonkom
            kSession.insert(pacijentn2); //Ubrzan srcani ritam
          
            kSession.insert(l);
            
            kSession.fireAllRules();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
 
