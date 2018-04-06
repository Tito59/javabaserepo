package wetic.javabase.gui;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TestException {

	public static void main(String[] args) {
		
		int i = 40, j = 0;
		try {
		System.out.println(i / j);
		System.out.println("Je me trouve juste avant le ctach !");
		}catch(ArithmeticException e) {
			PrintWriter writer = null;
			try {
				writer = new  PrintWriter("c:/javadev/temp/logs.txt", "UTF-8");
				writer.println(e.getMessage());
				writer.println(e.getStackTrace());
				writer.println(e.getCause());
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				writer.close();
			}
			
			System.out.println("Division par zero !");
		}
		System.out.println("Salut !");
	}

}
