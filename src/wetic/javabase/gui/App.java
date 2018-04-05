package wetic.javabase.gui;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 25; i++) {
			System.out.println("Indice: " + i);
			
		}
		
		int i = 0;
		while (i < 25) {
			System.out.println("Indice: " + i);
			i++; //i = i + 1;
		}
		System.out.println("Je me situe juste après le for");
	}
}
