import java.util.*;
public class SecondSmallNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int min2 = Integer.MAX_VALUE;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min2 = min;
				min = arr[i];
			}
			else if(arr[i] < min2 && min != arr[i]) {
				min2 = arr[i];
			}
		}
		System.out.println(min2);
		
		sc.close();
	}

}
