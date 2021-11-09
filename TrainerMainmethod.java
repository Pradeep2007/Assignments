package com.compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrainerMainmethod {

	public static void main(String[] args) {
		List<Trainer> t = new ArrayList<Trainer>();
		t.add(new Trainer(201, "Pradeep", "2year"));
		t.add(new Trainer(205, "Varsha", "0.6year"));
		t.add(new Trainer(203, "Guna", "1year"));
		t.add(new Trainer(202, "Adithya", "5year"));
		t.add(new Trainer(204, "Pradeep", "3year"));
	//	Collections.sort(t);  //Comparable
		Collections.sort(t,new TrainerReverse()); //Comparator
		System.out.println(t);
		

	}

}
