import java.util.*;
public class DuplicatesRemover {
	public static void main(String[] args) {
														// Removes duplicates in a array.
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int[] arr2 = new int[arr.length];
		int fill = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean found = false;
			for(int j = 0; j < fill; j++) {
				if(arr[i] == arr2[j]) {
					found = true;
					break;
				}
			}
			if(!found) {
				arr2[fill] = arr[i];
				fill++;
			}
		}
		System.out.print(Arrays.toString(arr2));
	}
}
