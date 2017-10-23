import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;



public class Main {
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}
}


class TaskA {
	 public void solve(int testNumber, InputReader in, PrintWriter out) {
		String s = "abcd";
		int n = in.nextInt();
		int mod = n % 4;
		n = n/4;
		for(int i = 0; i < n; i++)
			out.print(s);
		out.print(s.substring(0, mod));
  }
	 
}
  
  
         //||||||| comparable pair ||||||||
 class pair implements Comparable<pair>{
	 public long p,q , jj;
	 public pair(){
		 p = q = 0;
		 jj = 0;
	 }
	@Override
	public int compareTo(pair arg0) {
		if(this.p > arg0.p)
			return 1;
		else if(this.p < arg0.p)
		     return -1;
		else if(this.q > arg0.q)
			return -1;
		else if(this.q < arg0.q)
			return 1;
		return 0;
	}
 }

 
   // ||||||| INPUT READER ||||||||
class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public Integer nextInt() {
        return Integer.parseInt(next());
    }
    
    public Long nextLong() {
    	return Long.parseLong(next());
    }
    
    public Double nextDouble() {
    	return Double.parseDouble(next());
    }
    
    public Float nextFloat() {
    	return Float.parseFloat(next());
    }
    
    
    public String nextLine() {
    	try {
			return reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    	
    }
    
    public int[] nextIntegerArray(int n) {
    	int[] a = new int[n];
    	for(int i = 0; i <  n; i++)
    		a[i] = nextInt();
    	
    	return a;
    }
    
    public Long[] nextLongArray(int n) {
    	Long[] a = new Long[n];
    	for(int i = 0; i <  n; i++)
    		a[i] = nextLong();
    	
    	return a;
    }
    
    public long[] nextlongArray(int n) {
    	long[] a = new long[n];
    	for(int i = 0; i <  n; i++)
    		a[i] = nextLong();
    	
    	return a;
    }
    
    public double[] nextdoubleArray(int n) {
    	double[] a = new double[n];
    	for(int i = 0; i <  n; i++)
    		a[i] = nextDouble();
    	
    	return a;
    }
    
    public String[] nextStringArray(int n){
    	String[] s = new String[n];
    	for(int i = 0; i < n; i++)
    		s[i] = next();
    	return s;
    }
    
    public String[] nextLineStringArray(int n){
    	String[] s = new String[n];
    	for(int i = 0; i < n; i++)
    		s[i] = next();
    	return s;
    }

    
    }