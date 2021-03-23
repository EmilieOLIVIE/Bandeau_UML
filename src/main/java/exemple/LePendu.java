package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class LePendu extends Effet {

	@Override
	public void seJouerSur(Bandeau monBandeau) {
		String message = "Le jeu du pendu"; //2, 6, 9 = ' ', maxI = 14
		String messageToFind = "";
		for(int i = 0; i < message.length(); i++) {
			if(message.charAt(i) != ' ') messageToFind = messageToFind.concat("_");
			else messageToFind = messageToFind.concat(" ");
		}
		
		monBandeau.setMessage(messageToFind);

		while(!message.equals(messageToFind)) {
			int random = (int) (Math.random() * (message.length()));
			if(messageToFind.charAt(random) == '_') {
				messageToFind = messageToFind.substring(0, random).concat(message.substring(random, random+1)).concat(messageToFind.substring(random + 1, messageToFind.length()));
				monBandeau.setMessage(messageToFind);
				monBandeau.sleep(1000);
			}
		}
	}

}
