import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskA {
    
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    	String s = in.next();
    	Integer ans = 0,sum = 0;
    	if(s.length() != 1)
    	while(true){
    		for(int i = 0; i < s.length(); i++)
    			sum += s.charAt(i)-'0';
    		++ans;
    		s = Integer.toString(sum);
    		sum = 0;
    		if(s.length()==1)
    			break;
    	}
    	out.println(ans);
      } 
    }

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
    
    public BigInteger nextBigInteger() {
    	return new BigInteger(next());
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
    
    public Integer[] nextIntegerArray(int n) {
    	Integer[] a = new Integer[n];
    	for(Integer i = 0; i <  n; i++)
    		a[i] = nextInt();
    	
    	return a;
    }
    
    public Long[] nextLongArray(int n) {
    	Long[] a = new Long[n];
    	for(Integer i = 0; i <  n; i++)
    		a[i] = nextLong();
    	
    	return a;
    }
    
    public String[] nextStringArray(int n){
    	String[] s = new String[n];
    	for(Integer i = 0; i < n; i++)
    		s[i] = next();
    	return s;
    }
    
    public String[] nextLineStringArray(int n){
    	String[] s = new String[n];
    	for(Integer i = 0; i < n; i++)
    		s[i] = next();
    	return s;
    }

    
    }