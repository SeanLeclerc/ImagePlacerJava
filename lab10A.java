import logdm.utilitaires.Visionneur;

public class lab10A {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(false, // Avec ou sans grille
				21, // Nombre de colonne
				21, // Nombre de ranger
				666, // Ne sert a rien
				false, // Avec ou sans console
				Visionneur.GRAPHIQUE,
				Visionneur.MOYENNE);
		int code = 1;
		
		for (int i = 0; i < 21; i++) {
			v.placerImage(i, 0, code);
			v.placerImage(0, i, code);
			v.dormir(50);
			
		}
		for (int i = 0; i < 21; i++) {
			v.placerImage(i, 20, code);
			v.placerImage(20, i, code);
			v.dormir(50);
		
				
			
		}
	}

}
