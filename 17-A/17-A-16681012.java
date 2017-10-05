import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////SOLUTION ///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




public  class Solution{
   static boolean[] rel;
   static int n,k;
   static ArrayList<Integer> p;
   //sieve
   public static void sieve(int N){
	   N=1009;
	   int  l=0;
	   Arrays.fill(rel,true);
	   rel[0]=rel[1]=false;
	   for(int i = 2; i <= N; i++){
		   if(rel[i])
			   {
			   p.add(i);
			   for(int j = i*i; j <= N; j+=i)
				   rel[j]=false;}
	   }
   }
   
	//main
	public static void main(String[] args){
	
		Scanner in=new Scanner (System.in) ;
		int count=0;
		n=in.nextInt();
		k=in.nextInt();
		
		rel=new boolean[1010];
		p=new ArrayList<>();
		sieve(n);
		
		for(int i=0; i < p.size()-1; i++){
			//System.out.print(p.get(i+1)+" ");
			int x=p.get(i)+p.get(i+1)+1;
			if(x>n)
				break;
			else if(rel[x])
				count++;
		}
		if(count>=k)	
		    System.out.println("YES");
		else
			System.out.println("NO");
		
	}//void main
}//class main