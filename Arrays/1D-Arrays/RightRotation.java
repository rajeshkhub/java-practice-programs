import java.util.*;
public class RightRotation {
	public static void main(String[] args) {
																// Right rotation of array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		
		for(int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter number of rotations : ");
		int rotations = sc.nextInt();
		sc.close();
		rotations = rotations % size;
		int[] arr2 = new int[size];
		
		for(int num : arr) {
			if(rotations == size) {
				rotations = 0;
				arr2[rotations] = num;
			}
			else if(rotations < size) {
				arr2[rotations] = num;
			}
			rotations++;
		}
		
		System.out.println("Array after right rotation : "+Arrays.toString(arr2));
	}
}
