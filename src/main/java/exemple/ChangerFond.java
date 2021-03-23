package exemple;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class ChangerFond extends Effet {

	@Override
	public void seJouerSur(Bandeau monBandeau) {
        Color back = monBandeau.getBackground();
        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.sleep(1000);
        monBandeau.setBackground(back);
	}

}
