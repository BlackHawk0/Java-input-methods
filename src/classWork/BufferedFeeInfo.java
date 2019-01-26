package classWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;




public class BufferedFeeInfo {
	public static void main (String args[]) throws Exception{
	BufferedReader fee = new  BufferedReader( new InputStreamReader (System.in));
	float balance;
	System.out.println("Enter your fee balance");
	balance = Float.parseFloat (fee.readLine());
	System.out.println("Your fee balance is : " + balance);
	
	}

}
