package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class Clignoter extends Effet {

	@Override
	public void seJouerSur(Bandeau monBandeau) {
        monBandeau.setMessage("On clignote");
        monBandeau.setFont(new Font("Dialog", Font.BOLD, 15));
        monBandeau.sleep(100);
        monBandeau.setMessage("");
        monBandeau.sleep(100);
	}

}
