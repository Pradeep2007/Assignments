package com.number.equalornot;

public class Equalornot {
	public void printEqual(int a,int b,int c) {
		if(a==b && a==c) {
			System.out.println("Number is equal");
		}
			else if(a!=b && a!=c) {
				System.out.println("All numbers are not equal");
		}
			else if(a<0 || b<0 || c<0) {
				System.out.println("Number is zero");
			}
			else {
				System.out.println("Invalid Number");
			}
		
	}
	public static void main(String[] args) {
		Equalornot e = new Equalornot();
		e.printEqual(-1, -2, -3);
	}

}
