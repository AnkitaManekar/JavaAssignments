/*
 5.Find the number of occurrences of given word in a sentence where sentence and word are user inputs 
 */

package Assignment5;

import java.util.Scanner;

public class WordOccurrences {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String sentence = sc.nextLine();
		// String uc=sentence.toUpperCase();
		System.out.println("Enter Word: ");
		String word = sc.nextLine();

		int count = 0;
		String name[] = sentence.split(" ");
		for (int i = 0; i < name.length; i++) {
			//System.out.println(name[i]);
			if (name[i].contentEquals(word)) {
				count++;
			}

		}
		System.out.println("The occurrence of word " + word + " is " + count);
	}

}
