package jeuvie.ocean.vague.casemer;

import java.util.List;

import jeuvie.Couleur;
import jeuvie.bestiole.Bestiole;
import jeuvie.bestiole.Dauphin;
import jeuvie.bestiole.IBestiole;
import jeuvie.ocean.IOcean;

public class CaseEauProfonde extends Case {
	

	
	protected void setBestioleVivante() {
		occupant = new Dauphin();
	}

	/**
	 * � chaque �tape, l��volution d�une cellule est enti�rement d�termin�e par l��tat de ses huit voisines de la fa�on suivante :

	 * Une cellule morte poss�dant exactement trois voisines vivantes devient vivante (elle na�t).
	 * Une cellule vivante poss�dant deux ou trois voisines vivantes le reste, sinon elle meurt.
	 * @param col la colonne dans la matrice
	 * @param j la ligne dans la matrice
	 * @return si cette case pr�cise doit survivre ou non.
	 */
	public void evoluer(IOcean copie, int col, int lg){
		if(copie.compterVoisinsVivants(col, lg) >= 3 && vide) {
			this.setVivante();
		} else if ((copie.compterVoisinsVivants(col, lg) < 2 || copie.compterVoisinsVivants(col, lg) > 3) && !vide) {
			occupant.tuer();
		}
	}

	public CaseEauProfonde() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CaseEauProfonde(IBestiole b) {
		super(b);
	}
	
	private CaseEauProfonde(Dauphin occupant, boolean vide) {
		
	}


	@Override
	public Couleur getCouleurCaseVide() {
		return Couleur.BLEU_SOMBRE;
	}
	
}
