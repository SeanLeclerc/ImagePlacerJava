import logdm.utilitaires.*;
import java.awt.*;

public class Lab10 {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(false, // Avec ou sans grille
				10, // Nombre de colonne
				12, // Nombre de ranger
				666, // Ne sert a rien
				false, // Avec ou sans console
				Visionneur.GRAPHIQUE, Visionneur.GRANDE);
		do {

			v.placerImage(3, 4, 30);
			v.dormir(2000);
			v.effacer(3, 4);
			int[][] g = new int[v.getNbColonnes()][v.getNbRangees()];
			for (int r = 0; r < v.getNbRangees(); r++) {
				for (int c = 0; c < v.getNbColonnes(); c++) {
					g[c][r] = -1; // Veut dire libre
				}
			}
			int n = v.lireInt("Nombre d'images : ");
			int x, y;
			for (int i = 0; i < n; i++) {
				do {
					x = (int) (Math.random() * v.getNbColonnes());
					y = (int) (Math.random() * v.getNbRangees());
				} while (g[x][y] != -1);
				int code = (int) (Math.random() * 100);
				v.placerImage(x, y, code);
				g[x][y] = code;

			}
			v.dormir(2000);
			for (int i = 0; i < 10; i++) {
				v.effacer(8, 5);
				v.dormir(500);
				v.placerImage(8, 5, 70, i % 4, Color.CYAN);
				v.dormir(500);
			}
			v.dormir(2000);
			v.effacer();
		} while (v.lireBoolean("Desirez vous continuer ?", "Oui", "Non"));

	}

}
