import java.util.*;
public class LeftRotation {
  public static void main(String[] args) {
																// Left rotation of array.	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter size of array : ");
	  int size = sc.nextInt();									// Size of the input array.
	  int[] arr = new int[size];
	  System.out.println("Enter array elements : ");
	  
	  for(int i = 0; i < size; i++)								// for loop to insert array elements.
		  arr[i] = sc.nextInt();

	  System.out.println("Enter number of rotations : ");
	  int rotations = sc.nextInt();								// Number of left rotations to perform on array.
	  sc.close();												// Scanner close.
	  rotations = rotations % size;								// If rotaions > size then rotations will be in range of size.
	  															// Using another array and for each loop.
	  int[] arr2 = new int[size];								// Output array size equal to input array size.
	  
	  for(int num : arr) {										// for each loop to derive input array elements each at a time.
		  if(rotations == 0) {									// Checks if rotations equal to 0.
			  rotations += size;								// if condition is true then rotations will be increased by size.
			  arr2[size-rotations] = num;						// num will be stored in the arr2 array at index size - rotations.
		  }
		  else if(rotations > 0) {								// checks else if rotations greater than 0.
			  arr2[size-rotations] = num;						// If greater than 0, then num element will be inserted into output array at index size - rotations.
		  }
		  rotations--;											// Rotations decrement.			
	  }
	  System.out.println("Array after left rotation : "+Arrays.toString(arr2));
  }
}
