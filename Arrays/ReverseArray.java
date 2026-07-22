import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length/2; i++) {
			int element = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = element;
		}
		System.out.println(Arrays.toString(arr));
    sc.close();
	}

}
