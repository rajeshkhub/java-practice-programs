import java.util.*;
public class MergeArrays {
	public static void main(String[] args) {
																// Merge two arrays.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array: ");
		int size = sc.nextInt();								// Size of first array.
		int[] arr = new int[size];								// First array "arr".
		System.out.println("Enter first array elements: ");
		
		for(int i = 0; i < size; i++)							// First for loop to insert elements into array arr.
			arr[i] = sc.nextInt();

		System.out.println("Enter size of second array: ");
		int size2 = sc.nextInt();								// Size of second array.
		int[] arr2 = new int[size2];							// Second array "arr2".
		System.out.println("Enter second array elements: ");
		
		for(int i = 0; i < size2; i++)							// Second for loop to insert elements into array arr2.
			arr2[i] = sc.nextInt();
		
		int[] mergedArr = new int[size + size2];				// Third array "mergedArr" with combined sizes of first and second array.
		
		for(int i = 0; i < arr.length; i++)						// Third for loop to insert first array elements into result array. 
			mergedArr[i] = arr[i];
			
		for(int i = 0; i < arr2.length; i++) 					// Fourth for loop to insert second array elements into result array from first arrays last next index.
			mergedArr[arr.length+i] = arr2[i];
	
		System.out.println("After merging both arrays : "+Arrays.toString(mergedArr));
		sc.close();
	}
}
