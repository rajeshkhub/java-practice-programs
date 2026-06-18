package ippo;
import java.util.*;
public class OddrEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
while(true){try{
System.out.println("Enter a number : ");
int a = sc.nextInt();
String c = (a%2==0)? "Even" : "Odd";
System.out.println("The given number "+a+" is : "+c);}
catch(InputMismatchException e){
	System.out.println("Invalid input!");
	sc.next();
	continue;}
String b;
while(true) {
System.out.println("Do u want to continue : yes/no");
b=sc.next().toLowerCase();
if(b.equals("yes")) break;
else if(b.equals("no")) break;
else {System.out.println("Invalid answer.");continue;}}
if(b.equals("no")) break;}
System.out.println("Thank you");
sc.close();}}