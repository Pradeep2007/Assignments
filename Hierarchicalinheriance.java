package com.inheritancetypes;

import java.util.Scanner;

public class Hierarchicalinheriance {
		int a,b,z;
		Scanner s = new Scanner(System.in);
		void input() {
			 System.out.println("Enter the two numbers:");
			 a=s.nextInt();
			 b=s.nextInt();
		}

}
 class Hieratchicalsubclss extends Hierarchicalinheriance {
	public void add() {
		z=a+b;	
	}
	public void display() {
		System.out.println("Addition of two numbers="+z);
		
	}
}
 class Hieratchicalchildclass extends Hierarchicalinheriance {
	public void mul() {
		z=a*b;
	}
	public void display() {
		System.out.println("Multiplication of two numbers="+z);
	}
}
 class Grandchild extends Hierarchicalinheriance {
		public void div() {
			z=a/b;
		}
		public void display() {
			System.out.println("Division of two numbers="+z);
		}
	}
 class Hieratchicalmainclass{
	public static void main(String[] args) {
		Hierarchicalinheriance a = new Hierarchicalinheriance();
		a.input();
		Hieratchicalsubclss c = new Hieratchicalsubclss();
		c.display();
		Hieratchicalchildclass d = new Hieratchicalchildclass();
		d.display();
		Grandchild b = new Grandchild();
		b.display();
	}

}
