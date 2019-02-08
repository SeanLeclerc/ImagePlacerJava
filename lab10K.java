import logdm.utilitaires.Visionneur;

public class lab10K {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(false, // Avec ou sans grille
				21, // Nombre de colonne
				21, // Nombre de ranger
				666, // Ne sert a rien
				false, // Avec ou sans console
				Visionneur.GRAPHIQUE,
				Visionneur.MOYENNE);
		//On remplit
		for (int r = 0; r < 21; r++) {
			for (int c = 0; c < 21; c++) {
				v.placerImage(r, c, 1);
				
			}
			
		}
		//On efface 21*21 cellules
		for (int i = 0; i < 21*21; i++) {
			v.effacer((int)(Math.random()*21), 
					(int)(Math.random()*21));
			
		}
		
		
	}


	

}
