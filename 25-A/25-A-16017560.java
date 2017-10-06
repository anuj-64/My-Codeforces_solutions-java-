import java.util.*;
import java.io.*;
public class Solution {
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int odd=0;int even=0,e=0,o=0;
    int[] as=new int[n];
    for(int i=0;i<n;i++) {
    	int s=in.nextInt();
    	as[i]=s%2;
    	if(as[i]==1)
    		{
			odd++;o=i+1;}
    	else
    		{even++;e=i+1;}
    }
    if(odd==1)
    	System.out.println(o);
    else
    	System.out.println(e);
    
    
    
    
}}