package wetic.javabase.gui;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashset {

	public static void main(String[] args) {
		// Declaration & Initialisation
		HashSet monHashset = new HashSet();
		
		monHashset.add("Didi");
		monHashset.add(15);
		monHashset.add('D');
		monHashset.add(58.6);
		monHashset.add(null);
		
		Iterator monIterator = monHashset.iterator();
		
		while (monIterator.hasNext()) {
			System.out.println(monIterator.next());
			
		}
		
		

	}

}
