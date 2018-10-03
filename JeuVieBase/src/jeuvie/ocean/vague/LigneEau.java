package jeuvie.ocean.vague;

import java.util.ArrayList;
import java.util.List;

import jeuvie.ocean.vague.casemer.ICase;


public abstract class LigneEau implements ILigneEau {
	
	protected static int TAILLE;

	protected List<ICase> lesCases;

	protected abstract void remplirDeCasesVides();
	
	public List<ICase> getLesCases(){
		return lesCases;
	}

	public ICase get(int i) {
		return lesCases.get(i);
	}

	public int getNbColonnes() {
		return TAILLE;
	}

	protected boolean add(ICase element){
		System.out.println("i" + TAILLE + element + "\n");
		return lesCases.size() <= TAILLE ? lesCases.add(element) : false ;
		
	}
	
	protected LigneEau(int taille) {
		super();
		TAILLE = taille;
		lesCases = new ArrayList<ICase>();
		//System.out.println("i" + taille);
		remplirDeCasesVides();
	}


}
