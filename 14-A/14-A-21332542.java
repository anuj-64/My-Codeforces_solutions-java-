import java.util.*;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Integer.*;


 
 
public class Main {
	public static void main(String[] args) throws Exception{
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}

static class TaskA {
  // GCD && LCM 
	 long gcd(long a ,long b){return b == 0 ? a : gcd(b , a % b);}
	 long lcm(long a , long b){return a*(b/gcd(a, b));}
 
	 // REverse a String 
	String rev(String s){
		return new StringBuilder(s).reverse().toString();
	}
	/*          SOLUTION  IS RIGHT HERE     */
	public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException{
		 //BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		//  Scanner sc = new Scanner(System.in);
      int n = in.nextInt(), m = in.nextInt();
      int xa , ya , xb , yb;
      xa = n; ya = m; xb = yb = 0;
      
      char[][] grid = new char[n][m];
      
      for(int i = 0; i < n; i++)
    	  grid[i] = in.next().toCharArray();
      
      for(int i = 0; i < n; i++){
    	  for(int j = 0; j < m; j++){
    		if(grid[i][j] == '*'){
    			if(i < xa)xa = i;
    			if(xb < i)xb = i;
    			if(j < ya)ya = j;
    			if(yb < j)yb = j;
    		}  
    	  }
      }
      //out.println(xa+" "+xb+" "+ya+" "+yb);
      for(int i = xa; i <= xb; i++){
    	  for(int j = ya; j <= yb; j++)
    		out.print(grid[i][j]);
    		
    	  out.println();
    	  }
  }
} 

 // ||||||| INPUT READER ||||||||
 static class InputReader {
	private byte[] buf = new byte[8000];
	private int index;
	private int total;
	private InputStream in;
	BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
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
	
	public String scan_nextLine() {
        int n = scan();
        while (isWhiteSpace(n))
            n = scan();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(n);
            n = scan();
        } while (!isEndOfLine(n));
        return res.toString();
    }
	public boolean isWhiteSpace(int n){
		if(n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
			return true;
		return false;
	}
	
	private boolean isEndOfLine(int c) {
        return c == '\n' || c == '\r' || c == -1;
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
	
	public String nextLine() throws IOException{
		return scan_nextLine();
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