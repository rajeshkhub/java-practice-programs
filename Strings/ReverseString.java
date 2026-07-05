import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
																	// Returns reversed form of a word by reversing it using String builder / for loop.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String word = sc.nextLine();
		sc.close();
		StringBuilder sb = new StringBuilder(word);  				//Assigning string word to StringBuilder constructor.
		System.out.print("Now your string is in reverse gear : ");
																	//or using for loop method.
		/*for(int i = word.length()-1; i >= 0; i--) {				//Loop starts from last index of string word.
			System.out.print(word.charAt(i));						//Prints characters of word from last index.
		}*/
		System.out.println(sb.reverse()); 							//stringbuilder reverse method.
	}
}
