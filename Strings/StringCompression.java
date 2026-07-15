import java.util.*;
public class StringCompression {
	public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string : ");
		String word = sc.next();
    int num = 1;
		for(int i = 0; i < word.length(); i++) {
      int count = 1;
			for(int j = num; j < word.length(); j++) {
        if(word.charAt(i) == word.charAt(j)) {
					count++;
					num = j+2;
				}
				else {
					num = j+1;
					break;
				}
			}
			if(count > 1) {
				System.out.print(word.charAt(i)+""+count);
				i = num-2;
			}
			else System.out.print(word.charAt(i));
		}
    sc.close();
  }
}
