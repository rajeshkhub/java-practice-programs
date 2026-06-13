import java.util.*;
public class SecondLargeNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int firstMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMax) {
				firstMax=arr[i];}}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==firstMax) {
				arr[i]-=firstMax;
			}
		}
		int secondMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondMax) {
				secondMax=arr[i];
			}
		}
		System.out.println("The second largest number is : "+secondMax);
	}
}
