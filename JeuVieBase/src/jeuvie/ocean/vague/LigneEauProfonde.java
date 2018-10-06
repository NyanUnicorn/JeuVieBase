package jeuvie.ocean.vague;

import java.util.ArrayList;
import java.util.List;

import jeuvie.ocean.vague.casemer.CaseEauProfonde;
import jeuvie.ocean.vague.casemer.ICase;

public class LigneEauProfonde extends LigneEau {

	
	public LigneEauProfonde(int taille) {
		super(taille);
		
	}

	protected void remplirDeCasesVides() {
		for(int i = 0; i < TAILLE; i++) {
			add(new CaseEauProfonde());
		}
	}
	
	protected LigneEauProfonde clone()  {
		LigneEauProfonde rep = null;
		try {
			rep= (LigneEauProfonde) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		List<ICase> cases = new ArrayList<ICase>(lesCases);
		
		if(rep != null) {
			rep.lesCases = cases;
		}
		
		
		return rep;
	}
	
}
