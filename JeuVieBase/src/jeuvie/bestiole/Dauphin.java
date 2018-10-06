package jeuvie.bestiole;

import jeuvie.Couleur;


public class Dauphin extends Bestiole{

	private static final Couleur MORT = Couleur.BLEU_MARINE;
	private static final Couleur VIVANT = Couleur.BLEU_GRIS;


	@Override
	protected Couleur getCouleurVivant() {
		return VIVANT;
	}

	@Override
	protected Couleur getCouleurMort() {
		return MORT;
	}

	public Dauphin() {
		super();
	}

	@Override
	public Dauphin clone()  {
		Dauphin rep = null;
		try {
			rep= (Dauphin) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return rep;
	}




}
