import java.util.*;
public class MergeArrays {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		for(int i = 0; i < size2; i++)
			arr2[i] = sc.nextInt();
		int[] arr3 = new int[size+size2];
		for(int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		for(int i = 0; i < arr2.length; i++) {
			arr3[arr.length+i] = arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
	}
}
