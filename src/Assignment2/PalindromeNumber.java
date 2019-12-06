/*
2.Write Java program to check if a number is palindrome in Java? 
( 121 is palindrome, 321 is not). Take input from user.
 */

package Assignment2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int rem;
		int res = 0;
		int num = sc.nextInt();
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			res = (res * 10) + rem;
		}

		if (temp == res) {
			System.out.println(temp + " is a Palindrome.");
		} else {
			System.out.println(temp + " is not Palindrome.");
		}
		
		sc.close();
	}

}
