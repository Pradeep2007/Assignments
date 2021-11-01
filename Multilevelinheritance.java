package com.inheritancetypes;

public class Multilevelinheritance {
	public void add(int a,int b) {
		int sum = a + b;
		System.out.println("Addition of two numbers are="+sum);
	}
}
 class Childclass extends Multilevelinheritance{
	public void sub(int a,int b) {
		int sub = a - b;
		System.out.println("Subtraction of two numbers are="+sub);	
	}
}
 class Grandclass extends Childclass{
	 public void mul(int a,int b ) {
		 int mul = a * b;
		 System.out.println("Multiplication of two number are="+mul);
	}
 
 }
  class Mainmethod{
	public static void main(String[] args) {
	Grandclass g = new Grandclass();
	g.add(50,30);
	g.sub(10,36);
	g.mul(12,9);

	}

}
