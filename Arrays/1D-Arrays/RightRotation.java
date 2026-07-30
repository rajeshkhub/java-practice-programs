import java.util.*;
public class RightRotation {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int rotations = sc.nextInt();
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
	System.out.println(Arrays.toString(arr2));
}
}
