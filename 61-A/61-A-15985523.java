import java.util.*;
import java.io.*;
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] as=new int[1001];
		int sum=0;
	    String str=in.next();
	    String str1=in.next();
	    String str2="";
	    for(int i=0;i<str.length();i++){
	    	if(str.charAt(i)==str1.charAt(i))
	    	str2=str2+0;
	    	else
	    		str2=str2+1;
	    }
	    System.out.println(str2);
	}
}