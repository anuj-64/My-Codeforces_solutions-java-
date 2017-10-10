import java.util.*;



public  class Solution{
 
		 public static void main(String[] args){
		   
		   Scanner in=new Scanner (System.in);
		   int max=0;
		   int n=in.nextInt(),m=in.nextInt();
		   int sum=n*(n+1)/2;
		   m=m%sum;
		   for(int i=1;i<=n;i++){
			   if(m>=i)
				   m=m-i;
		   }
		   System.out.println(m);
		   
}//void main
	   
}//class main