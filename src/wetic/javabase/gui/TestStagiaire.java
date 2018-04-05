package wetic.javabase.gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import wetic.javabase.bal.Stagiaire;
import wetic.javabase.bal.StagiaireCompare;

public class TestStagiaire {

	public static void main(String[] args) {
		//Déclarer une collection d'objet stagiaire.
		List<Stagiaire> stagiaireList = new ArrayList<Stagiaire>();
		//Ajouter des stagiaires dans la collection.
		stagiaireList.add(new Stagiaire("Botman", "Patrick"));
		stagiaireList.add(new Stagiaire("Botman", "Louis-philippe"));
		stagiaireList.add(new Stagiaire("Wertz", "Pierre"));
		stagiaireList.add(new Stagiaire("Bouali", "Kamel"));
		//Afficher la liste des stagiaires.
		
		displayStagiaires(stagiaireList, "Avant");
		
		Collections.sort(stagiaireList, new StagiaireCompare());
		
		displayStagiaires(stagiaireList, "Aprés");


	}

	/**
	 * @param stagiaireList
	 * @param str
	 */
	private static void displayStagiaires(List<Stagiaire> stagiaireList
			, String str) {
		System.out.println(str + " le tri: ");
		for (Stagiaire currentItem : stagiaireList) {
			System.out.println("\t" + currentItem);
		}
	}

}
