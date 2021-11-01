package wholenumberandrangeofnumber;

public class Rangeofnumber {

	public static void main(String[] args) {
		int sum=0;	
		for(int number=1;number<=1000;number++) {

		if(number%3==0 || number%5==0) {
			sum=number+sum;
		}
		}
		
		System.out.println("Sum of the numbers that divided by 3 and 5 :"+sum);
		
	}

}
