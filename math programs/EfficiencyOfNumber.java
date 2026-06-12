import java.util.*;
public class EfficiencyOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arry size : ");
		int size=sc.nextInt();
		int box[] = new int[size];
		System.out.println("Enter elements :");
		for(int i=0;i<size;i++) {
			box[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<box.length;i++) {
			if(box[i]==-1) continue;
			int count =1;
			for(int j=i+1;j<box.length;j++) {
				if(box[i]==box[j]) {
					count++;
					box[j]=-1;
				}
			}
			System.out.println(box[i]+" occurs "+count+" time/s.");
		}
	}
}
