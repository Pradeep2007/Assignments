package com.compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FamilyMainmethod {

	public static void main(String[] args) {
		List<Family> f = new ArrayList<Family>();
		f.add(new Family(54, "G.Anand", "Father"));
		f.add(new Family(24, "Pradeep.A", "Son"));
		f.add(new Family(22, "Praveen.A", "Son"));
		f.add(new Family(39, "R.Bhagaya", "Mother"));
	//	Collections.sort(f);     //Comparable
		Collections.sort(f,new FamilyReverse()); //Comparator
		System.out.println(f);
		
	}

}
