package com.compartor;

import java.util.Comparator;

public class FamilyReverse implements Comparator<Family> {

	@Override
	public int compare(Family o1, Family o2) {
		
		return o2.age-o1.age;
	}

}
