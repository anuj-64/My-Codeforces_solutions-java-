import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.Format;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

import java.awt.List;
 
 
public class Main {
	public static void main(String[] args){
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}

static class TaskA {
	//public ArrayList<Integer> ar;
	public boolean[] bs;
	
  // GCD && LCM 
	 long gcd(long a ,long b){return b == 0 ? a : gcd(b , a % b);}
	 long lcm(long a , long b){return a*(b/gcd(a, b));}
	
  // Sieve of erothenese
	void sieve(int UB ){
		//ar = new ArrayList();
		bs = new boolean[UB+1];
		bs[0] = bs[1] = true;
		for(int i = 2; i*i <= UB; i++){
			if(!bs[i]){
				for(int j = i*i ; j <= UB ; j += i)
					bs[j] = true;
			}
		}
		// for(int i = 2; i <= UB; i++){
		  //    if(!bs[i])ar.add(i);
		//}
	}
	
	// REverse a String 
	
	String rev(String s){
		return new StringBuilder(s).reverse().toString();
	}
	
	// all pair shortest path
	
	public void ShortestPath(int n , int[][] grid){
		
		for(int k = 1; k <= n; k++){
        	for(int i = 1; i <= n; i++){
        		for(int j = 1; j <= n; j++){
        			grid[i][j] = min(grid[i][j] , grid[i][k] + grid[k][j]);
        		}
        	}
        }
		//return grid;
	}
	
	
	/*          SOLUTION  IS RIGHT HERE     */
	
	
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		 // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 // Scanner sc = new Scanner(System.in);
		
	  String s = in.next();
	  
	  HashMap<String, Integer> map = new HashMap<>();
	  
	  for(int i = 0; i < 10; i++)
		  map.put(in.next(), i);
	  
	  for(int i = 0; i < 80;){
		String  ss = s.substring(i, i+10);
		out.print(map.get(ss));
		i+=10;
	  }
	  
     }
}  

   // union
 static class dsu{
	 int[] union , size;
	 
	 public dsu(int n){
		 union = new int[n+1];
		 size = new int[n+1];
		 for(int i = 0; i <= n; i++){
			 union[i] = i;
			 size[i] = 1;
		 }
	 }
	 public int root(int s){
		 while(s != union[s])
			 s = union[s];
		 return s;
	 }
	 
	 public boolean connected(int a , int b){
	    return root(a) == root(b);
	 }
	 
	 public void union(int a, int b){
		 int ea = root(a);
		 int eb = root(b);
		 if(a == b);
		 else if(size[ea] > size[eb]){
			 union[eb] = ea;
			 size[ea] += size[eb];
		 }else{
			union[ea] = eb;
			size[eb] += size[ea];
		 }
	 }
	 
 }
  // pair class
 static class pair implements Comparable<pair>{
	 int first , second ;
	 public pair(){this.first = 0; this.second = 0;}
	 public pair(int f , int s){
		 this.first = f;
		 this.second = s;
	 }
	@Override
	public int compareTo(pair one) {
		if(this.first < one.first)
			return -1;
		if(this.first > one.first)
			return 1;
		if(this.second < one.second)
			return -1;
		if(this.second > one.second)
		    return 1;
		return 0;
	}
	 
 }
  
 // ||||||| INPUT READER ||||||||
 static class InputReader {
	private byte[] buf = new byte[2048];
	private int index;
	private int total;
	private InputStream in;
	
	public InputReader(InputStream stream){
		in = stream;
	}
	
	public int scan(){
		if(total == -1)
			throw new InputMismatchException();
		if(index >= total){
			index = 0; 
			try{
			total = in.read(buf);
			}catch(IOException e){
			   throw new InputMismatchException();
			}
			if(total <= 0)
				return -1;
		}
		return buf[index++];
	}
	public long scanlong(){
		long integer = 0;
		int n = scan();
		while(isWhiteSpace(n))
			n = scan();
		int neg = 1;
		if(n == '-'){
			neg = -1;
			n = scan();
		}
		while(!isWhiteSpace(n)){
			if(n >= '0' && n <= '9'){
				integer *= 10;
				integer += n - '0';
				n = scan();
			}
			else throw new InputMismatchException();
		}
		return neg*integer;
	}
	
	private int scanInt() {
		int integer = 0;
		int n = scan();
		while(isWhiteSpace(n))
			n = scan();
		int neg = 1;
		if(n == '-'){
			neg = -1;
			n = scan();
		}
		while(!isWhiteSpace(n)){
			if(n >= '0' && n <= '9'){
				integer *= 10;
				integer += n - '0';
				n = scan();
			}
			else throw new InputMismatchException();
		}
		return neg*integer;
	}
	
	public double scandouble(){
		double doubll = 0;
		int n = scan();
		int neg = 1;
		while(isWhiteSpace(n))
			n = scan();
		if(n == '-'){
			neg = -1;
			n = scan();
		}
		while(!isWhiteSpace(n) && n != '.'){
			if(n >= '0' && n <= '9'){
				doubll *= 10;
				doubll += n - '0';
				n = scan();
			}
		}
		if(n == '.'){
			n = scan();
			double temp = 1;
			while(!isWhiteSpace(n)){
				if(n >= '0' && n <= '9'){
					temp /= 10;
					doubll += (n - '0')*temp;
					n = scan();
				}
			}
		}
		return neg*doubll;
	}
	
	private float scanfloat() {
		float doubll = 0;
		int n = scan();
		int neg = 1;
		while(isWhiteSpace(n))
			n = scan();
		if(n == '-'){
			neg = -1;
			n = scan();
		}
		while(!isWhiteSpace(n) && n != '.'){
			if(n >= '0' && n <= '9'){
				doubll *= 10;
				doubll += n - '0';
				n = scan();
			}
		}
		if(n == '.'){
			n = scan();
			double temp = 1;
			while(!isWhiteSpace(n)){
				if(n >= '0' && n <= '9'){
					temp /= 10;
					doubll += (n - '0')*temp;
					n = scan();
				}
			}
		}
		return neg*doubll;
	}
	public String scanstring(){
		StringBuilder sb = new StringBuilder();
		int n = scan();
		while(isWhiteSpace(n))
			n = scan();
		while(!isWhiteSpace(n)){
			sb.append((char)n);
			n = scan();
		}
		return sb.toString();
	}
	
	
	public boolean isWhiteSpace(int n){
		if(n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
			return true;
		return false;
	}
/// Input module 	
	
	public int nextInt(){
	  return scanInt();
	}
	
	public long nextLong(){
		  return  scanlong();
		}
	
	public double nextDouble(){
		  return  scandouble();
		}
	
	public float nextFloat(){
		  return scanfloat();
		}

	public String next(){
		return scanstring();
	}
	
	public int[] readIntArray(int size)  {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = nextInt();
        }
        return array;
    }
}
 
}