import java.util.*;
public class MinMax {
	public static void main(String[] args) {
																									// Finds Minimum and Maximum numbers in array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] array = new int[size];																// Assigning size to array.
		System.out.println("Enter your elements.");
		for(int i = 0; i < size ; i++) {															// For loop to insert input elements in array.
			array[i] = sc.nextInt();
		}
		System.out.print("Your array elements are : ");
		for(int i = 0; i < array.length ;i++) {														// For loop to print array elements.
			System.out.print(array[i]+" ");
		}
		while(true) {																				// While loop (continues loop if user gives invalid input).
			System.out.println("\nChoose your option : \n1. Maximum element \n2. Minimum element");
																									// Max block
			int choice = sc.nextInt();
			if(choice == 1) {
				int max = array[0];
				for(int i = 0; i < array.length;i++) {
					if(array[i] > max) {
						max = array[i];
					}
				}
				System.out.println("\nMax of the array : "+max);
				break;
			}
																									// MIN block
			else if(choice == 2) {
				int min = array[0];
				for(int i = 0 ; i < array.length ;i++) {
					if(array[i] < min) {
						min = array[i];
					}
				}
				System.out.println("\nMin of the array : "+min);
				break;
			}
			else {
				System.out.println("Invalid input!");
			}
		}
		sc.close();
	}
}
