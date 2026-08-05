import java.util.*;
public class DuplicatesRemover {
	public static void main(String[] args) {
														// Removes duplicates in a array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();						// Size of the array.
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		
		for(int i = 0; i < size; i++)					// for loop to insert elements into array.
			arr[i] = sc.nextInt();
		
		sc.close();										// Scanner close.
		int[] arr2 = new int[arr.length];				// New array for result.
		int fill = 0;									// integer fill to use it as output array index.
		for(int i = 0; i < arr.length; i++) {			// for loop to iterate over array.
			boolean found = false;						// found boolean variable is initially false.
			for(int j = 0; j < fill; j++) {				// Inner for loop for comparison.
				if(arr[i] == arr2[j]) {					// Compares input array element with output array elements.
					found = true;						// if same elements found then found variable becomes true.
					break;								// And breaks the inner loop.
				}
			}
			if(!found) {								// Checks if found is false.
				arr2[fill] = arr[i];					// If found is false then inserts the input array elements into the output array at index fill.
				fill++;									// fill increments.
			}
		}
		System.out.print("After removing duplicates : "+Arrays.toString(arr2));
	}
}
