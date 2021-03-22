package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class UtilisationClasses {

    public static void main(String[] args) {
        new UtilisationClasses().exemple();
    }

    public void exemple() {
        Bandeau monBandeau = new Bandeau();
        
        monBandeau.setMessage("Hello");
        monBandeau.sleep(1000);
        
        monBandeau.setMessage("On va changer de police");
        monBandeau.sleep(1000);
        Effet monEffet = new ChangerPolice();
        monEffet.seJouerSur(monBandeau);
                
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monEffet = new Zoom();
        monEffet.seJouerSur(monBandeau);

        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monEffet = new Tourner();
        monEffet.seJouerSur(monBandeau);

        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monEffet = new ChangerFond();
        monEffet.seJouerSur(monBandeau);
        
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(3000);
        monBandeau.close();
    }
}
