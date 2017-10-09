import java.lang.*;
import java.io.*;
import java.util.*;
public class Solution{
		public static void main(String args[]){
			Scanner in = new Scanner(System.in);
		    String str=in.next();
		    String str1=str.toUpperCase();
		    String str2=str.toLowerCase();
		    int u=0,l=0;
		    for(int i=0;i<str.length();i++){
		    	if(str.charAt(i)!=str1.charAt(i))
		    		u++;
		    	if(str.charAt(i)!=str2.charAt(i))l++;
		    }
			if(u<l)
				System.out.println(str1);
			else
				System.out.println(str2);
		}}