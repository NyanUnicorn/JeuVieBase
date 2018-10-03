package jeuvie.ocean;

import java.util.ArrayList;
import java.util.List;

import jeuvie.ocean.vague.ILigneEau;
import jeuvie.ocean.vague.LigneEauProfonde;


public class HauteMer extends Ocean {


	private static final int NB_LIGNES = 55;
	private static final int NB_COLONNES = 60;


	protected HauteMer(List<ILigneEau> grille) {
		super(grille);
		// TODO Auto-generated constructor stub
	}

	
	protected void remplirDeLignesEau() {
		for(int i = 0; i < NB_LIGNES; i++) {
			grille.add(new LigneEauProfonde(NB_COLONNES));
		}		
	}

	public int getNbLignes() {
		return NB_LIGNES;
	}


	@Override
	public int getNbColonnes() {
		return NB_COLONNES;
	}


	public HauteMer(int forme) {
		super(forme);
		// TODO Auto-generated constructor stub
	}

	


}
