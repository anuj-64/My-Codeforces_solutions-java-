import java.lang.*;
import java.io.*;
import java.util.*;
public class Solution
{
		public static void main(String args[]){
	    Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
	    int[] l=new int[1002];
	    for(int i=0;i<n;i++){
	    	l[i]=0;}
	    for(int i=0;i<n;i++){
	    	l[in.nextInt()]++;
	    }int max=0,m=0,sum=0;
	    for(int i=0;i<1002;i++){
	    	if(max<l[i]){
	    		max=l[i];m=i;}
	    		if(l[i]>0)
	    			sum++;
	    	
	    }
        System.out.println((max)+" "+sum);	
		
		
		
		
		}}