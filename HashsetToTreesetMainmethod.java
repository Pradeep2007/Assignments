package com.treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashsetToTreesetMainmethod {

	public static void main(String[] args) {
		HashSet<HashsetToTreeset> h = new HashSet<HashsetToTreeset>();
		TreeSet<HashsetToTreeset> s = new TreeSet<HashsetToTreeset>(h);
		s.add(new HashsetToTreeset(101, "Pradeep", "Yelehanka"));
		s.add(new HashsetToTreeset(105, "Guna", "Nes"));
		s.add(new HashsetToTreeset(102, "varsha", "Place ground"));
		s.add(new HashsetToTreeset(103, "Adithya", "Old town"));
		s.add(new HashsetToTreeset(104, "Sadhu", "Maruthi Nagar"));
		
		for (HashsetToTreeset hashsetToTreeset : s) {
			System.out.println(hashsetToTreeset);
			
		}
	

	}

}
