import logdm.utilitaires.Visionneur;

public class lab10B {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(false, // Avec ou sans grille
				21, // Nombre de colonne
				21, // Nombre de ranger
				666, // Ne sert a rien
				false, // Avec ou sans console
				Visionneur.GRAPHIQUE,
				Visionneur.MOYENNE);
		
		
		for (int i = 0; i < 21; i++) {
			v.placerImage(20, 20-i,(i%2==0? 1:0));
			v.placerImage(20-i, 20,(i%2==0? 1:0));
			
		}
		for (int i = 0; i < 21; i++) {
			v.placerImage(0, 20-i, (i%2==0? 1:0));
			v.placerImage(20-i, 0,(i%2==0? 1:0));
			
		}

	}

}
