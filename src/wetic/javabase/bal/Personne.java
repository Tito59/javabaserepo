package wetic.javabase.bal;

import wetic.javabase.utils.NomException;
import wetic.javabase.utils.NombreEnfantException;
import wetic.javabase.utils.PrenomException;

public class Personne {

	private String nom;
	private String prenom;
	private int nombreEnfants;
	
	
	public Personne(String nom, String prenom, int nombreEnfants) throws NombreEnfantException, PrenomException, NomException {
		
		String errorMsg ="";
		
		if (nombreEnfants < 0) {
			errorMsg += "Vous entrez un nombre d'enfants négatifs \n";
		}
		if (prenom.length() < 4) {
			errorMsg += "Le prenom de l'enfant doit être supérieur à 4 caractères \n";
		} 
		if (nom.length() < 4) {
			errorMsg += "Le nom de l'enfant doit être supérieur à 4 caractères \n";
		}
		
		if (nombreEnfants < 0) {
			throw new NombreEnfantException(errorMsg);
		} else if (prenom.length() < 4) {
			throw new PrenomException(errorMsg);
		} else if (nom.length() < 4) {
			throw new NomException(errorMsg);
		} else {
			this.nom = nom;
			this.prenom = prenom;
			this.nombreEnfants = nombreEnfants;
		}			
		
	}
	
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", nombreEnfants=" + nombreEnfants + "]";
	}
	
	
}
