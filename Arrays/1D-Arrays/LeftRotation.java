import java.util.*;
public class LeftRotation {
  public static void main(String[] args) {
										
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter size of array : ");
	  int size = sc.nextInt();
	  int[] arr = new int[size];
	  System.out.println("Enter array elements : ");
	  
	  for(int i = 0; i < size; i++)
		  arr[i] = sc.nextInt();

	  System.out.println("Enter number of rotations : ");
	  int rotations = sc.nextInt();
	  rotations = rotations % size;
	  int[] arr2 = new int[size];
	  
	  for(int num : arr) {
		  if(rotations == 0) {
			  rotations += size;
			  arr2[size-rotations] = num;
		  }
		  else if(rotations > 0) {
			  arr2[size-rotations] = num;
		  }
		  rotations--;
	  }
	  System.out.println("Array after left rotation : "+Arrays.toString(arr2));
	  sc.close();
  }
}
