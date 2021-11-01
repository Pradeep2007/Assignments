package com.removing.duplicated.elements;

import java.util.Arrays;

public class Removingduplicatedelements {

	public static void main(String[] args) {
		int[] a = {1, 2, 2, 5, 1, 6, 12, 7, 12, 12, 3, 8};
	    int[] b = removeDuplicates(a);
	    System.out.println("");
	    System.out.println("after removal");
	    for(int i : b){
	      System.out.print(i+" ");
		}
	}
	 public static int[] removeDuplicates(int[] a){
		    int i = 1;
		    int j = 0;
		    Arrays.sort(a);
		    System.out.println("Sorted array");
		    for(int x : a){
		      System.out.print(x+" ");
		    }
		    while(i < a.length){
		      if(a[i] == a[j]){
		        i++;
		      }else{
		        a[++j] = a[i++];
		      }   
		    }
		    // This is required to truncate the size of the array
		    // otherwise array will retain its original size
		    int[] c = Arrays.copyOf(a, j+1);
		    return c;
		  }

}
