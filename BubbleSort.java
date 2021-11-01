package com.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		String a[]= {"Java","Python","PHP","C#","C Programming","C++"};
		int size=a.length;
		for(int i=0; i<size-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i].compareTo(a[j])>0) {
					String temp=a[i];
					    a[i]=a[j];
					    a[j]=temp;	    
				}
			}
		}
		System.out.println(Arrays.toString(a));

}
}
