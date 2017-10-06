import java.util.*;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////SOLUTION ///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




public  class Solution

{    	//sieve
	public static boolean[] sieve(){
		int MAX=3002;
		
		boolean[] prime=new boolean[MAX+1];
		for(int i=0;i<=MAX;i++)
			prime[i]=true;
		prime[0]=false;
		prime[1]=false;
		for(int i=2;i*i<=MAX;i++)
		{
			if(prime[i]==true)
				{for(int j=i*i;j<=MAX;j+=i)
					prime[j]=false;}
		}
		return prime;
	}   
    
	//main
	public static void main(String[] args){
	Scanner in=new Scanner (System.in) ;	
    boolean[] prime=new boolean[3003];
    prime=sieve();
    int n=in.nextInt();
    int count=0,sum=0;
    
    for(int i=1;i<=n;i++){
    	int temp=i;
    	for(int j=2;j<=n;j++){
    		int flag=0;
    		while(temp%j==0)
    		{temp=temp/j;flag=9;}
    		if(flag==9 && prime[j])
    			sum++;
    	}
    	if(sum==2)
    		count++;
    	sum=0;
    }
    
    
 System.out.println(count);

}//void main

}//class main