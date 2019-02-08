
import logdm.utilitaires.*;

public class lab10F {
	public static void main(String[] args) {
		Visionneur v = new Visionneur(
				true,      //Avec grille
				21,        //Nombre de colonne
				21,        //Nombre de rengers
				666,       //Inutile
				true,      //Avec console?
				Visionneur.GRAPHIQUE,
				Visionneur.MOYENNE );
		for (int i = 0; i < 21; i++) {
			v.placerImage(i,i,1);
			v.dormir(100);
			v.effacer(i,i-1);
			v.placerImage(i, i-1, 0);
			v.placerImage(i+1,i,1);
			v.dormir(100);
			v.effacer(i,i);
			v.placerImage(i, i, 0);
			v.dormir(100);
			
		}
	}

}
