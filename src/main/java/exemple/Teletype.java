package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class Teletype extends Effet {

	@Override
	public void seJouerSur(Bandeau monBandeau) {
		String message = "Exemple";
        for (int i = 0; i <= message.length(); i++) {
            monBandeau.setMessage(message.substring(0, i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);
	}
	
}
