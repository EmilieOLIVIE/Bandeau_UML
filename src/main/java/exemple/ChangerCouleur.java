package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class ChangerCouleur extends Effet {

	@Override
	public void seJouerSur(Bandeau monBandeau) {
        monBandeau.setMessage("On va changer de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.YELLOW);
	}

}
