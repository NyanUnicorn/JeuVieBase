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
		//TODO
	}

	public int getNbLignes() {
		return 0;		
		//TODO
	}


	@Override
	public int getNbColonnes() {
		// TODO Auto-generated method stub
		return 0;
	}



}
