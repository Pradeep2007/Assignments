package com.treeset;

public class HashsetToTreeset implements Comparable<HashsetToTreeset> {
	int id;
	String name;
	String address;
	@Override
	public String toString() {
		return "HashsetToTreeset [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public HashsetToTreeset(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public int compareTo(HashsetToTreeset o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

}
