import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String word = sc.nextLine();
		StringBuilder sb = new StringBuilder(word); //StringBuilder
		System.out.print("Now your string is in reverse gear : ");
		
		//or using for loop method
		/*for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}*/
		
		System.out.println(sb.reverse()); //stringbuilder method
	}
}
