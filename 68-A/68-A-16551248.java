import java.util.*;

public  class Solution{ 
     //main
	public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int p1=in.nextInt(),p2=in.nextInt(),p3=in.nextInt(),p4=in.nextInt();
    int count=0,a=in.nextInt();
    int b=in.nextInt();
    for(int i=a;i<=b;i++){
    	if(i<p1 && i<p2 && i<p3 && i<p4)
    		count++;
    }
	System.out.println(count);   
}}