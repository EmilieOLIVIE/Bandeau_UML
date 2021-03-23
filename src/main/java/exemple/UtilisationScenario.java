package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class UtilisationScenario {

    public static void main(String[] args) {
        new UtilisationScenario().exemple();
    }

    public void exemple() {
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        
        monBandeau.setMessage("Hello");
        monBandeau.sleep(1000);
                
        Scenario monScenario = new Scenario();
        
        Effet monEffet = new LePendu();
        monScenario.ajouterEffet(monEffet, 1);
        		
        monEffet = new Teletype();
        monScenario.ajouterEffet(monEffet, 1);
        
        monEffet = new Clignoter();
        monScenario.ajouterEffet(monEffet, 10);
        
        monEffet = new Zoom();
        monScenario.ajouterEffet(monEffet, 1);
        
        monEffet = new Tourner();
        monScenario.ajouterEffet(monEffet, 2);

        monScenario.seJouerSur(monBandeau);

        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(1000);
        monBandeau.close();
    }
}
