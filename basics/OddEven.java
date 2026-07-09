import java.util.*;
public class OddEven {
	public static void main(String[] args) {
																			// Finds whether the number is odd or even number.
		Scanner sc = new Scanner(System.in);
		outer : while(true){												// While loop to continue program.
			try{															// Try block to throws exception.
				System.out.println("Enter a number : ");
				int num = sc.nextInt();
				String word = (num % 2 == 0)? "Even" : "Odd";				// Terinary operator for result.
				System.out.println("The given number "+num+" is : "+word);
			}
			catch(InputMismatchException e){								// Catch block handles the exception thrown from try block.
				System.out.println("Invalid input!");
				sc.next();
				continue;
			}
			inner : while(true) {											// While loop to control continuation of the program.
				System.out.println("Do u want to continue : yes/no");
				String word2 = sc.next().toLowerCase();
				if(word2.equals("yes")) break inner;
				else if(word2.equals("no")){
					System.out.println("Thank you")
					break outer;
				}
				else {
					System.out.println("Invalid answer");
					continue;
				}
			}
		}
	}
}
