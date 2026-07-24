import java.util.*;
public class SecondSmallNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
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
		System.out.println(min2);
		sc.close();
	}
}
