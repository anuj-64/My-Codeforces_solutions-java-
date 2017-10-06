import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String str1 = in.next();
		int sum = 0, s = str.length() - 1,p=str1.length()-1;
		if(s==p){
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str1.charAt(s - i))
				sum++;
		}
		if (sum == str.length())
			System.out.println("YES");
		else
			System.out.println("NO");}
		else
			System.out.println("NO");
	}
}