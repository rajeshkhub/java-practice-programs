import java.util.*;
public class MissingNumber {
	public static void main(String[] args) {
													// Finds missing number from array which contains Numbers from 1 to N.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();					// Size of the array.
		int[] arr = new int[size];
		System.out.println("Enter array numbers skipping any one number from 1 to N : ");
    
		for(int i = 0; i < size; i++)				// for loop to insert input elements into the array.
			arr[i] = sc.nextInt();
      
		int sum = 0;								// sum integer varaible to calculate sum of the array elements.
		int num = 1;								// Variable num to add numbers from 1 to N.
		for(int i = 0; i < arr.length; i++) {		// for loop to iterate over array.
			sum += arr[i];							// sum of all array numbers.
			num += (arr.length+1)-i;				// sum of numbers 1 to N.
		}
		System.out.print(num-sum);					// Print missing number.
		sc.close();									// Scanner close.
	}
}
