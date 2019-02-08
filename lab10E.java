import logdm.utilitaires.*;
public class lab10E {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(false, // Avec ou sans grille
				21, // Nombre de colonne
				21, // Nombre de ranger
				666, // Ne sert a rien
				false, // Avec ou sans console
				Visionneur.GRAPHIQUE,
				Visionneur.MOYENNE);
		
		for( int i = 0; i<21; i++) {
			v.placerImage(20-i, i, 1);
			v.placerImage(20, i, 1);
			v.dormir(20);
		}
		for (int i = 1; i < 20; i++) {
			v.placerImage(i, 20, 1);
			v.dormir(20);
			
		}

	}

}
