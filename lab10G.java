import logdm.utilitaires.Visionneur;

public class lab10G {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(
				true,      //Avec grille
				21,        //Nombre de colonne
				21,        //Nombre de rengers
				666,       //Inutile
				true,      //Avec console?
				Visionneur.GRAPHIQUE,
				Visionneur.MOYENNE );
		do{
			
		
		int code = v.lireInt("Code d'image:",1);
		for (int i = 0; i < 11; i++) {
			v.placerImage(10+i, 10,code);
			v.placerImage(10-i, 10,code);
			
			v.placerImage(10, 10-i,code);
			
			v.placerImage(10, 10+i, code);
			
			v.placerImage(10-i, 10-i, code);
			
			v.placerImage(10-i, 10-i, code);
			
			v.placerImage(10+i, 10+i, code);
			
			v.placerImage(10-i, 10+i, code);
			
			v.placerImage(10+i, 10-i, code);
			v.dormir(100);
		}
			
		}while(v.lireBoolean("Encore?","oui","non"));
		v.effacer();
		int x,y;
		do {
			int[] t = v.lireCoordonnees();
			x = t[0];
			y = t[1];
			v.placerImage(x, y, 1);
			
			
		}while(x!=0 || y!=0);
		
			
			
		
				
	}

}
