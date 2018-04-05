package wetic.javabase.bal;

import java.util.Comparator;

public class StagiaireCompare implements Comparator<Stagiaire> {

	@Override
	public int compare(Stagiaire s1, Stagiaire s2) {
		if (s1.getNom().compareToIgnoreCase(s2.getNom()) != 0) {
			return s1.getNom().compareToIgnoreCase(s2.getNom());
		}else {
			return s1.getPrenom().compareToIgnoreCase(s2.getPrenom());
			
		}
	}

}
