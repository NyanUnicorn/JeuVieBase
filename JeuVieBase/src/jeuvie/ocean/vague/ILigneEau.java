package jeuvie.ocean.vague;

import java.util.List;

import jeuvie.ocean.vague.casemer.ICase;

public interface ILigneEau extends Cloneable {

	public ICase get(int i) ;

	public int getNbColonnes();
	
}
