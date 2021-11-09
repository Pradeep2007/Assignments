package com.compartor;

import java.util.Comparator;

public class ColleaguesReverse implements Comparator<Colleagues> {

	@Override
	public int compare(Colleagues o1, Colleagues o2) {
		// TODO Auto-generated method stub
		return o2.age-o1.age;
	}

}
