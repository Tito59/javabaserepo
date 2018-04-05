package wetic.javabase.gui;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import wetic.javabase.bal.AnnualCA;

public class TestAnnualYear {

	public static void main(String[] args) {
		List<AnnualCA> listAnnualCA = new ArrayList<AnnualCA>();
		listAnnualCA.add(new AnnualCA("2015", 17000));
		listAnnualCA.add(new AnnualCA("2016", 20000));
		listAnnualCA.add(new AnnualCA("2017", 25000));
		listAnnualCA.add(new AnnualCA("2018", 30000));

        for (Iterator<AnnualCA> iterator = listAnnualCA.iterator(); iterator.hasNext();) {
			AnnualCA annualCA = (AnnualCA) iterator.next();
			System.out.println(annualCA);
			
		}
	}
}
