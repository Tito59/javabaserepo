package wetic.javabase.gui;

import java.util.Scanner;

public class Exercice12Tableaux {

	public static void main(String[] args) {
		// Declaration
		final int n = 5;
		float somme = 0;
		float[] tab = new float[n];
		// Remplir le tableau
		System.out.println("Donnez les valeurs a saisir dans le tableau: ");
		Scanner sc = new Scanner(System.in);
		String values = "";
		String str = "";
		for (int i = 0; i < n; i++) {
			tab[i] = sc.nextFloat();
			
//			if (i < n - 1 ) {
//				str = " + ";
//			} else {
//				str = " = ";
//			}


			str = (i < n - 1 ) ? " + " : " = " ;
		
			values += tab[i] + str;
			somme += tab[i];
		}
		//Afficher la somme
		System.out.println("L'expression: " + values + " " + somme);
		
	}
}
