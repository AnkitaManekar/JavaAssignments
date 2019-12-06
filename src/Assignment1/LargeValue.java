
/* 1.Write a program that creates an array which can hold ten values. 
Fill the array with random numbers from 1 to 100. Display the values in the array on the screen. 
Then use a linear search to find the largest value in the array, and display that value.
*/

package Assignment1;

public class LargeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		arr[0] = 10;
		arr[1] = 16;
		arr[2] = 41;
		arr[3] = 78;
		arr[4] = 9;
		arr[5] = 14;
		arr[6] = 100;
		arr[7] = 51;
		arr[8] = 56;
		arr[9] = 67;

		for (int a : arr) {
			System.out.print(a + " ");
		}

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("\n Max no is: " + max);
	}
}
