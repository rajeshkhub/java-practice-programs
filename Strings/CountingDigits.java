import java.util.Scanner;
public class CountingDigits {
	public static void main(String[] args) {
																// Counts the number of digits present in a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		sc.close();
																//Storing input in string variable.
		/*String a = sc.next();
		 * System.out.println("Number of digits in the number are : "+a.length());
		 */
																//Using string methods.
		/*int length = String.valueOf(num).length();			//Converts int num variable into string and generates the length of it.
		System.out.println("No.of digits : "+length);
		*/
																//Using while loop.
		int count = 1;
		while(num >= 10) {										//While loop runs until num is equals to or less than 10.
			num /= 10;                                          //num is divided by 10.
			count++;                                            //Count increment.
		}
		System.out.println("No.of digits : "+count);
	}
}
