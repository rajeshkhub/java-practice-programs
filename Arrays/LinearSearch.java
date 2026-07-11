import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
																						// Finds target element index position in a array.
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter the array size : ");
               int size = sc.nextInt();
               int array[] = new int[size];												// Assigning size to the array.
               System.out.println("Enter your array elements : ");
               for(int i = 0; i < size; i++) {											// For loop to insert input numbers into the array.
				   array[i] = sc.nextInt();
			   }
               System.out.print("Your array elements are : ");
               for(int i = 0; i < array.length; i++) {									// For loop to print array elements.
				   System.out.print(array[i]+" ");
			   }
               System.out.println("\nWhich element you want to search : ");
               int target = sc.nextInt();												// Target element.
               boolean found = false;													
               for(int i = 0; i < array.length; i++) {									// For loop for finding target element in the array.
				   if(target == array[i]) {
					   System.out.println("Element found at index : "+i);				// Prints index of target element in the array.
					   found = true;													// Found becomes true when target element is found.
					   break;
				   }
			   }
		if(!found){																		// Condition if target is not found.
			System.out.println("Element not found in the list.");
		}
		sc.close();
	}
}
