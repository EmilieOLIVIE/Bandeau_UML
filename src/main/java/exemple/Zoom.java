package exemple;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class Zoom extends Effet {

	@Override
	public void seJouerSur(Bandeau monBandeau) {
        Font font = monBandeau.getFont();
        monBandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);
        monBandeau.setFont(font);        
	}

}
