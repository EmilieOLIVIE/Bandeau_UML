package exemple;

import java.util.ArrayList;
import java.util.List;

import bandeau.Bandeau;

public class Scenario {
	
	List<Effet> scenario = new ArrayList();

	public void ajouterEffet(Effet e, int r) {
		for(int i = 0; i < r; i++) {
			scenario.add(e);
		}
	}
	
	public void seJouerSur(Bandeau monBandeau) {
		for (Effet effet : scenario) {
			effet.seJouerSur(monBandeau);
		}
	}

}
