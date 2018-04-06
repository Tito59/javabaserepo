package wetic.javabase.commun;

import java.util.Scanner;

public class MyServices {
		
		public static int encoderData(String msg){
			int result;
			System.out.print(msg);
			Scanner sc = new Scanner(System.in);
			result = sc.nextInt();
			sc.close();
			return result;
			
		}

}
