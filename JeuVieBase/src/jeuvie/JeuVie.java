package jeuvie;

import controleur.Controleur;
import jeuvie.ocean.HauteMer;
import jeuvie.ocean.Ocean;


public class JeuVie {

	public static void main(String[] args) {
		
		//new Controleur(new BordDeCote(Ocean.PI));
		//new Controleur(new BordDeCote(Ocean.ALEA));

		//new Controleur(new HauteMer(Ocean.ALEA));
		//new Controleur(new HauteMer(Ocean.BARRE));
		//new Controleur(new HauteMer(Ocean.CANON));
		//new Controleur(new HauteMer(Ocean.CLOWN), Controleur.ITER_CLOWN);
		new Controleur(new HauteMer(Ocean.PI), Controleur.ITER_PI);
		//new Controleur(new HauteMer(Ocean.GRAND_VAISSEAU));
		//new Controleur(new HauteMer(Ocean.PETIT_VAISSEAU));
		
		/*
		List<Bestiole> listBestiole = new ArrayList<Bestiole>();
		for(int i = 0; i < 10; i++) {
			listBestiole.add(new Dauphin());
		}
		
		int j = 0;
		List<Case> listCase = new ArrayList<Case>();
		for(int i = 0; i < 20; i++) {
			if(i%2 == 0) {
				listCase.add(new CaseEauProfonde(listBestiole.get(j)));
				j++;
			}else {
				listCase.add(new CaseEauProfonde());
			}
		}
		
		
		for(Case c: listCase) {
			System.out.println(c);
		}
		*/
		//Controleur ct = new Controleur();
	}

}
