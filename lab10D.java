import logdm.utilitaires.*;
public class lab10D {

	public static void main(String[] args) {
	Visionneur v = new Visionneur(21,21, Visionneur.GRAPHIQUE,Visionneur.MOYENNE);
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < i*2+1; j++) {
				v.placerImage(j+10-i,i,1);
				
			}
			
		}
		for (int i = 0; i < 11; i++) {
			for (int j = i*2+1; j > 0; j--) {
				
				v.placerImage(j+10-i-1, 20-i, 1);
			}
			
		}


	}

}
