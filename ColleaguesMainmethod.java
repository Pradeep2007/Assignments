package com.compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColleaguesMainmethod {

	public static void main(String[] args) {
		List<Colleagues> c = new ArrayList<Colleagues>();
		c.add(new Colleagues("Ramya", 23, "Project Leader"));
		c.add(new Colleagues("Chithanya", 21, "Senior Developer"));
		c.add(new Colleagues("Guna", 24, "Junior Developer"));
		c.add(new Colleagues("Adithya", 20, "Manager"));
		c.add(new Colleagues("Varsha", 54, "CEO"));
	//	Collections.sort(c);  //Comparable
		Collections.sort(c,new ColleaguesReverse()); //Comparator
		System.out.println(c);
		
	}
}
