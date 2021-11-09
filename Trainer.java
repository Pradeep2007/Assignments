package com.compartor;

public class Trainer implements Comparable<Trainer> {
	int id;
	String name;
	String experience;
	public Trainer(int id, String name, String experience) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", experience=" + experience + "]";
	}
	@Override
	public int compareTo(Trainer o) {
		// TODO Auto-generated method stub
		return this.experience.compareTo(o.experience);
	}
	

}
