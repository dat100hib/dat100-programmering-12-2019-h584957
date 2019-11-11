package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	
	private Innlegg[]Innleggtabell;
	private int nesteledig;

	public Blogg() {
		Innleggtabell =new Innlegg[20];
		nesteledig =0;
	}

	public Blogg(int lengde) {
		Innleggtabell = new Innlegg[lengde];
		nesteledig=0;
	}

	public int getAntall() {
		
		int antall = 0;
		
		for (int i=0; i<Innleggtabell.length;i++) {
			
			if (Innleggtabell[i]!= null) {
				antall++;
				nesteledig++;
			}
			
		}
			
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return Innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int index =-1;
		
		for(int i=0;i<Innleggtabell.length;i++) {
		
			if (innlegg.erLik(Innleggtabell[i])) {
			index =i;
			break;
		}
		}
		return index;
	}

	public boolean finnes(Innlegg innlegg) {
		
		int index = finnInnlegg(innlegg);
		if (index >=0) {
			return true;
		}
		else return false;
	}

	public boolean ledigPlass() {
		if(nesteledig < Innleggtabell.length) {
				return true;
		}
		else return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean ledig =ledigPlass();
		boolean funnet = finnes(innlegg);
		
		if((ledig == true)&&(funnet==false)) {
			
			Innleggtabell[nesteledig]=innlegg;
			nesteledig++;
			return true;
			
		}
		else return false;
	}
	
	
	public String toString() {
		
		String s;
		String j;
		for (int i = 0; i<Innleggtabell.length;i++ ) {
		j=Innleggtabell[i];
		s = s+j;
		}
	return getAntall() + s;
	}
	

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}