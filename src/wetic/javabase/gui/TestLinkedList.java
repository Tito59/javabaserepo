package wetic.javabase.gui;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		// On crée une nouvelle liste: 
		//Declaration et initialisatio de l'objet maListe
		List maListe = new LinkedList();

		//On se sert de la méthode add pour ajouter les elements
		// On peut ajouter les elements de tous les types dans la liste: 
		// char, float, ...
		maListe.add(25);
		maListe.add("Jean");
		
		
//		for (int i = 0; i < maListe.size(); i++) {
//			System.out.println("Element a l'index: " + i + " = " + 
//					maListe.get(i));	
//			
//			System.out.println("Parcours d'un iterateur: " + i + " = " + 
//					maListe.get(i));	

			ListIterator maListIterator = maListe.listIterator();
			while (maListIterator.hasNext()) {
				System.out.println(maListIterator.next());
			}
//		}

	}

}
