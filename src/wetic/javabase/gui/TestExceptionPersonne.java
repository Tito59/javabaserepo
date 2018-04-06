package wetic.javabase.gui;

import wetic.javabase.bal.Personne;
import wetic.javabase.utils.NomException;
import wetic.javabase.utils.NombreEnfantException;
import wetic.javabase.utils.PrenomException;

public class TestExceptionPersonne {

	public static void main(String[] args) {
		
		Personne unePersonne = null;
		String errorMsg = "";
		
		try {
			unePersonne = new Personne("Msr", "Dj", 5);
		} catch (NombreEnfantException e) {
			errorMsg += e.getMessage();
		} catch (PrenomException e) {
			errorMsg += e.getMessage();
		} catch (NomException e) {
			errorMsg += e.getMessage();
		}
	}

}
