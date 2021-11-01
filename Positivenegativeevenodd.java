package posinegatievenoddno;
import java.util.Scanner;

public class Positivenegativeevenodd {
	public boolean positiveAndNegativeNumber(int num) {
			if (num > 0){
		         System.out.println("Given number is a positive integer="+num);
		      } 
			else if(num < 0){
		         System.out.println("Given number is a negative integer="+num);
		      } 
			else {
		         System.out.println("Given number is neither positive nor negative integer");
		      }
			return true;
	    }	
	
	public boolean find_Oddeven(int num){
		if(num%2==0) 
		    System.out.println(num+" is even0"); 
		else 
		    System.out.println(num+" is odd");
		return false;
		}
	
	public int numberOf0s(long num) {
	int count=0;
		if(num>0){

	        if(num%10==0)
	        count++;

	        numberOf0s(num/10);
	    }
	    return count;
	    
	}

		public static void main(String[] args) {
			Positivenegativeevenodd a = new Positivenegativeevenodd(); 
			Scanner sc = new Scanner(System.in);  
			System.out.println("Enter a number: ");  
			int num = sc.nextInt();  
			System.out.println(" Number of 0's are="+a.numberOf0s(num)); 
			System.out.println("Enter a number: ");  
			num = sc.nextInt(); 
			System.out.println(a.positiveAndNegativeNumber(num));
			System.out.println(a.find_Oddeven(num));	
		}
	}
		 
