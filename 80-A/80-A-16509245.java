import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////  SOLUTION ///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




public  class Solution{  
    
	// sieve
	public static boolean[] sieve(){
		boolean[] prime=new boolean[56];
		for(int i=0;i<=55;i++)
			prime[i]=true;
		prime[0]=false;
		prime[1]=false;
		for(int i=2;i*i<=55;i++){
			if(prime[i]==true)
				{for(int j=i+i;j<=55;j=j+i)
					prime[j]=false;}
		}
		return prime;
	}
	
	
	
	//      main();   
	public static void main(String[] args) throws IOException{
		 
		
		
		///input
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  String[] str=br.readLine().split(" ");
	      int n=Integer.parseInt(str[0]);
	      int m=Integer.parseInt(str[1]);
	       boolean[] as=sieve();
	      int i=0;
	      for(i=n+1;;i++){
	    	 if(as[i]==true&&i!=m)
	    		{System.out.println("NO");break;}
	    	 if(i==m&&as[m]==true)
	    	{System.out.println("YES");	break;}  
	      }
         
		
}//void main
	   
}//class mainA