import java.util.*;
public class MissingNumber {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
    
		for(int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
      
		int sum = 0;
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			num += (arr.length+1)-i;
		}
		System.out.print(num-sum);
		sc.close();
	}
}
