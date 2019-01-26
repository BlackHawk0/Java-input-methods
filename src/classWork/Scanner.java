
package classWork;

// using the scanner class to obtain the user input and output the fee balance.


import java.util.Scanner;

public class FeeInfo {
	public static void main (String args[]) {
		Scanner balance = new Scanner (System.in);
		float rsc;
		
		System.out.println("Enter your fee balance : ");
		rsc = balance.nextFloat();
		System.out.println ("Your fee balance is : " + rsc);

	}
	
}




