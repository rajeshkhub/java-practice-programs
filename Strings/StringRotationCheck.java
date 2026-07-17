import java.util.*;
public class StrIngs2 {
	public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();
		String word3 = word1 + word1;
		if(word3.contains(word2)) System.out.println(word2+" is Rotation of "+word1);
		else System.out.println("No");
    sc.close();
	}
}
