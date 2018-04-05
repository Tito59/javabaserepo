package wetic.javabase.gui;

import java.util.Enumeration;
import java.util.Hashtable;

public class TestHashtable {

	public static void main(String[] args) {
		
		// Declaration & initialisation
		Hashtable monHash = new Hashtable();
		
		// On se sert de la methode put pour mettre des elements
		// Les elements seront positionné dans n'importe quel ordre
		monHash.put(1, "lundi");
		monHash.put(2, "mardi");
		monHash.put(3, "mercredi");
		monHash.put(4, "jeudi");
		monHash.put(5, "vendredi");
	
		Enumeration e = monHash.elements();
		
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			
		}
	}

}
