package com.compartor;

public class Family implements Comparable<Family>{
	int age;
	String name;
	String relation;
	public Family(int age, String name, String relation) {
		super();
		this.age = age;
		this.name = name;
		this.relation = relation;
	}
	@Override
	public String toString() {
		return "Family [age=" + age + ", name=" + name + ", relation=" + relation + "]";
	}
	@Override
	public int compareTo(Family o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
	

}
