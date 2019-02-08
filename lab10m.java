import logdm.utilitaires.Visionneur;

public class lab10m {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(false, // Avec ou sans grille
				21, // Nombre de colonne
				21, // Nombre de ranger
				666, // Ne sert a rien
				false, // Avec ou sans console
				Visionneur.GRAPHIQUE, Visionneur.MOYENNE);
		
		//Range du haut
		for (int i = 0; i < 21; i++) {
			v.placerImage(i, 0, 0);
			if(i>1 && i<19)v.placerImage(i, 2, 1);
			
		}
		for (int i = 0; i < 21; i++) {
			v.placerImage(20, i, 0);
			if(i>1 && i<19)v.placerImage(18, i, 1);
			
		}
		for (int i = 0; i < 21; i++) {
			v.placerImage(20-i, 20, 0);
			if(i>1 && i<19)v.placerImage(19-i+1, 18, 1);
			
		}
		for (int i = 0; i < 21; i++) {
			v.placerImage(0, 20-i, 0);
			if(i>1 && i<19)v.placerImage(2, 20-i, 1);
			
		}

	}

}
