package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class Tourner extends Effet {

	@Override
	public void seJouerSur(Bandeau monBandeau) {
        monBandeau.setMessage("On tourne...");
        for (int i = 0; i <= 100; i++) {
            monBandeau.setRotation(2 * Math.PI * i / 100);
            monBandeau.sleep(100);
        }
	}
	
}
