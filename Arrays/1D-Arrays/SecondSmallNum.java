import java.util.*;
public class SecondSmallNum {
	public static void main(String[] args) {
																		// Second smallest element.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int smallest = arr[0];
		int secSmallest = Integer.MAX_VALUE;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < smallest) {
				secSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < secSmallest && smallest != arr[i]) {
				secSmallest = arr[i];
			}
		}
		System.out.println("Second smallest number: "+secSmallest);
		sc.close();
	}
}
