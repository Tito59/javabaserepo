package wetic.javabase.gui;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		// On crée une nouvelle liste. 
		// Declaration et initialisation e l'objet maList
		ArrayList maListe = new ArrayList();
		
		maListe.add(25);
		maListe.add("Jean");
		maListe.add(25.5);		
		maListe.add('f');	
		
		for (int i = 0; i < maListe.size(); i++) {
			System.out.println("val: " + maListe.get(i));
		}

		maListe.remove(1);
		for (int i = 0; i < maListe.size(); i++) {
			System.out.println("val" + maListe.get(i));
			
		}
		System.out.println("est vide ?: " + maListe.isEmpty());
		System.out.println("contient f?: " + maListe.contains('f'));

	}

}
