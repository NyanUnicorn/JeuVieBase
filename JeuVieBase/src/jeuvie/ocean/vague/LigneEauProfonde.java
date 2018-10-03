package jeuvie.ocean.vague;

import jeuvie.ocean.vague.casemer.CaseEauProfonde;

public class LigneEauProfonde extends LigneEau {

	
	public LigneEauProfonde(int taille) {
		super(taille);
		
	}

	protected void remplirDeCasesVides() {
		for(int i = 0; i < TAILLE; i++) {
			add(new CaseEauProfonde());
		}
	}
	
	
}
