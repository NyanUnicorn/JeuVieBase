package jeuvie.bestiole;
import jeuvie.Couleur;

public abstract class Bestiole implements IBestiole {

	private static int compteur = 0;

	protected abstract Couleur getCouleurVivant();
	protected abstract Couleur getCouleurMort();
	private final int NUMERO;
	private Couleur etat;
		
	public void tuer(){
		etat = getCouleurMort();
	}
	

	@Override
	public int getNumero() {
		return NUMERO;
	}

	@Override
	public boolean isVivante() {
		return etat == getCouleurVivant();
	}

	@Override
	public Couleur getCouleur() {
		return etat;
	}
	
	
	public Bestiole() {
		super();
		etat = getCouleurVivant();
		NUMERO = compteur;
		compteur++;
	}

	@Override
	public String toString() {
		return "Bestiole[numero="+NUMERO+";état="+etat+"]";
	}
	
	
	
}
