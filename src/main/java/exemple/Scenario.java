package exemple;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
	
	List<Effet> scenario = new ArrayList();

	public void ajouterEffet(Effet e, Repetition r) {
		for(int i = 0; i < r.getNombre(); i++) {
			scenario.add(e);
		}
	}
}
