import java.util.*;
public class OddEven {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
while(true){try{
System.out.println("Enter a number : ");
int num = sc.nextInt();
String word = (num % 2 == 0)? "Even" : "Odd";
System.out.println("The given number "+num+" is : "+word);}
catch(InputMismatchException e){
	System.out.println("Invalid input!");
	sc.next();
	continue;}
String word2;
while(true) {
System.out.println("Do u want to continue : yes/no");
word2 = sc.next().toLowerCase();
if(word2.equals("yes")) break;
else if(word2.equals("no")) break;
else {System.out.println("Invalid answer.");continue;}}
if(word2.equals("no")) break;}
System.out.println("Thank you");
sc.close();}}
