import java.util.Scanner;
import java.util.*;
public class Solution{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    HashMap<String, Integer> hash = new HashMap<>();

		for (int i = 0; i < n;i++) {
			String s =in.next();
			if (!hash.containsKey(s)) {
				hash.put(s, 0);
				System.out.println("OK");
			} 
			else 
			{
				hash.put(s, hash.get(s) + 1);
				System.out.println(s + hash.get(s));
			}
		}
}}