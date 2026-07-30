import java.util.*;
public class RightRotation {
	public static void main(String[] args) {
																// Right rotation of array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();								// Size of the input array.
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		
		for(int i = 0; i < size; i++)							// for loop to insert array elements.
			arr[i] = sc.nextInt();

		System.out.println("Enter number of rotations : ");
		int rotations = sc.nextInt();							// Number of right rotations to perform on array.
		sc.close();												// Scanner close.
		rotations = rotations % size;							// If rotaions > size then rotations will be in range of size.
																// Using another array and for each loop.
		int[] arr2 = new int[size];								// Output array size equal to input array size.
		
		for(int num : arr) {									// for each loop derive input array elements each at a time.
			if(rotations == size) {								// Checks if rotations are equal to size.
				rotations = 0;									// if equal then no need to rotate array as it will be same.
				arr2[rotations] = num;
			}
			else if(rotations < size) {							// checks else if rotations less than size.
				arr2[rotations] = num;							// If less then num element will be inserted into output array at index rotation.
			}
			rotations++;
		}
		
		System.out.println("Array after right rotation : "+Arrays.toString(arr2));
	}
}
