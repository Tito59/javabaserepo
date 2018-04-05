package wetic.javabase.bal;

import java.util.Scanner;

public class MyServiceNumberHandler {
	/**
	 * @param nombreADevine
	 * @return
	 */
	public static int saisirAndTesterNombre(int nombreADevine) {
		int nombreChoisi;
		System.out.println("Entrez un nombre entre 0 et 1000: ");
		Scanner sc = new Scanner(System.in);
		nombreChoisi = sc.nextInt();	
		
		testerNombre(nombreADevine, nombreChoisi);
		return nombreChoisi;
	}

	/**
	 * @param nombreADevine
	 * @param nombreChoisi
	 */
	private static void testerNombre(int nombreADevine, int nombreChoisi) {
		if (nombreChoisi < nombreADevine) {
			System.out.println("C'est plus ! \n");
		} else if(nombreChoisi > nombreADevine){
			System.out.println("C'est moins ! \n");
		}
	}
}
