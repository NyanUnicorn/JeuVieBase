package jeuvie.ocean.vague.casemer;

import java.util.List;

import jeuvie.Couleur;
import jeuvie.bestiole.IBestiole;

public abstract class Case implements ICase {
	
	//protected List<ICase> lesCases;
	
	protected boolean vide = true;
	protected IBestiole occupant = null;

	public abstract Couleur getCouleurCaseVide();
	protected abstract void setBestioleVivante();


	public void setVivante(){
		vide = false;
		setBestioleVivante();
	}	

	public Couleur getCouleur(){
		return occupant != null ? occupant.getCouleur() : getCouleurCaseVide();
	}


	public boolean contientBestioleVivante(){
		return occupant != null ? occupant.isVivante() : false;
	}

	public void tuerEventuelOccupant(){
		if(occupant != null) {
			occupant.tuer();
		}
	}
	

	@Override
	public boolean isVide() {
		return false;
	}

	
	
	public Case() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected Case(IBestiole b) {
		occupant = b;
		vide = false;
	}
	
	@Override
	public String toString() {
		return "[vide="+vide+";occupant="+occupant+";couleur case="+getCouleur()+"]";
	}
	
	
	
	

}
