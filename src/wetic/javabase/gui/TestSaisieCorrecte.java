package wetic.javabase.gui;

import java.util.InputMismatchException;

import wetic.javabase.bal.SaisieCorrecte;
import wetic.javabase.commun.MyServices;

public class TestSaisieCorrecte {

	public static void main(String[] args) {
		
		int result;
		boolean isNotInteger = false;
		
		do {
			try {
				result = MyServices.encoderData("Veuillez entrer un nombre : ");
				SaisieCorrecte saisie1 = new SaisieCorrecte(result);
				System.out.println(saisie1);
				isNotInteger = false;
			} catch (InputMismatchException e) {
				isNotInteger = true;
			}
		} while (isNotInteger == true);
		

	}

}
