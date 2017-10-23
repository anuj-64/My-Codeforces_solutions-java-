import java.util.*;



public  class Solution{
 
		 public static void main(String[] args){
		   
		   Scanner in=new Scanner (System.in);
		   long max=0;
		   long k=in.nextLong(),l=in.nextLong();
		   long p=k;
		   while(p<l){
				   p=k*p;
				   max++;
		   }
		   if(p==l)
		       System.out.println("YES\n"+max);
		   else
			   System.out.println("NO");
		   
}//void main
	   
}//class main