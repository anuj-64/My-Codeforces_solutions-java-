import java.util.*;



public  class Solution

{   
	  
	   public static void main(String[] args){
		   
		   Scanner in=new Scanner (System.in);
		   
		   int y=in.nextInt();
		   int w=in.nextInt();
		   
		   int r=6-Math.max(y,w)+1;
		   if(r==0)
			   System.out.println(r+"/1");
		   else if(r==6)
			   System.out.println("1/1");
		   else if(r%2==0)
		   {
			   r=r/2;
			   System.out.println(r+"/3");
		   }
		   else if(r==3)
		   System.out.println(1+"/2");
		   else
			   System.out.println(r+"/6");
		   

 
		
}//void main
	   
}//class main