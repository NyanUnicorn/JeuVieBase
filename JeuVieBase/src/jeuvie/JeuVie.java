package jeuvie;

import java.util.ArrayList;
import java.util.List;

import jeuvie.bestiole.Bestiole;
import jeuvie.bestiole.Dauphin;


public class JeuVie {

	public static void main(String[] args) {
		
		//new Controleur(new BordDeCote(Ocean.PI));
		//new Controleur(new BordDeCote(Ocean.ALEA));

		//new Controleur(new HauteMer(Ocean.ALEA));
		//new Controleur(new HauteMer(Ocean.BARRE));
		//new Controleur(new HauteMer(Ocean.CANON));
		//new Controleur(new HauteMer(Ocean.CLOWN), Controleur.ITER_CLOWN);
		//new Controleur(new HauteMer(Ocean.PI), Controleur.ITER_PI);
		//new Controleur(new HauteMer(Ocean.GRAND_VAISSEAU));
		//new Controleur(new HauteMer(Ocean.PETIT_VAISSEAU));
		List<Bestiole> listBestiole = new ArrayList<Bestiole>();
		for(int i = 0; i < 10; i++) {
			listBestiole.add(new Dauphin());
		}
		
		for(Bestiole b: listBestiole) {
			System.out.println(b);
		}

	}

}
