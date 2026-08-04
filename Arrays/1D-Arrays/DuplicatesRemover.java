import java.util.*;
public class Array1D2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
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
				System.out.print(arr2[fill]+" ");
				fill++;
			}
		}
}
}
