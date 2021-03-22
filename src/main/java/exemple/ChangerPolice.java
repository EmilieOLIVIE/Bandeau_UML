package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class ChangerPolice extends Effet {

	@Override
	public void seJouerSur(Bandeau monBandeau) {
        monBandeau.setMessage("Monospaced 15 Bold");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
	}

}
