import java.util.*;
public class CountFrequency {
	public static void main(String[] args) {
																// Counts the number of occurrence of each element in a array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arry size : ");
		int size = sc.nextInt();
		int box[] = new int[size];								// Assigning size to the box array.
		System.out.println("Enter elements :");
		
		for(int i = 0; i < size; i++) {							// For loop to insert input integers into the array.
			box[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < box.length; i++) {					// For loop starts from 0 index.
			if(box[i] == -1) continue;							// Condition to skip elements marked as "-1". 
			int count = 1;
			
			for(int j = i+1; j < box.length; j++) {				// Nested for loop starts from index 1.
				if(box[i] == box[j]) {
					count++;									// Count increment if above condition is true.
					box[j] = -1;								// Replacing visited element with -1.
				}
			}
			System.out.println(box[i]+" occurs "+count+" time/s.");
		}
	}
}
