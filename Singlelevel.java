package com.inheritancetypes;

public class Singlelevel {
	public void m1(int age) {
		System.out.println(age);	
	}
}
class Subclass extends Singlelevel{
	public void m2(String name) {
		System.out.println(name);
	}
}
class Mainclass{
	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.m1(25);
		s.m2("Pradeep A");

	}

}
