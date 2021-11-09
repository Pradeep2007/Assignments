package com.compartor;

import java.util.Comparator;

public class TrainerReverse implements Comparator<Trainer> {

	@Override
	public int compare(Trainer o1, Trainer o2) {
		// TODO Auto-generated method stub
		return o2.id-o1.id;
	}

}
