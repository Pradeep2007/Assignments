package com.packages;

public class ArraysExample {

	public static void main(String[] args) {
	int a[] = {20, 30, 25, 35, -16, 60, -100};
	int total=0;	
	     for(int i=0;i<a.length;i++) {
			total = total + a[i];
		}
	     int avg = total / a.length;
	     System.out.println("Avarge of the given numbers are="+avg);

	}

}
