import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
 
 
 
public class Main {
	public static void main(String[] args) throws IOException{
		InputReader in = new InputReader(System.in);
		Printer out = new Printer(System.out);
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}
}
 
class TaskA {
	 public void solve(int testNumber, InputReader in, Printer out) throws IOException{
		  int d = in.nextInt(), 
		  sumTime = in.nextInt();
		  
		  int[][] set = new int[d][2];
		  int a,b, min = 0 , max = 0;
		  for(int i = 0; i < d; i++){
			  a = in.nextInt() ; b = in.nextInt();
			  min += a; max += b;
			  set[i][0] = a; set[i][1] = b;
		  }
		  if(sumTime < min || sumTime > max){
			  out.println("NO");
			  return;
		  }
		   out.println("YES");
		   a = sumTime - min;
		   for(int i = 0; i < d; i++){
			   b =  min(a , set[i][1] -set[i][0]);
			   out.print(set[i][0] + b+" ");
			   a -= b;
		   }
	 }
}
  
  
 // ||||||| INPUT READER ||||||||
class InputReader {
	private byte[] buf = new byte[2048];
	private int index;
	private int total;
	private InputStream in;
	
	public InputReader(InputStream stream){
		in = stream;
	}
	
	public int scan() throws IOException{
		if(total < 0)
			throw new InputMismatchException();
		if(index >= total){
			index = 0; 
			total = in.read(buf);
			if(total <= 0)
				return -1;
		}
		return buf[index++];
	}
	public long scanlong() throws IOException{
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
	public double scandouble() throws IOException{
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
	
	public String scanstring() throws IOException{
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
	
	public int nextInt() throws IOException{
	  return (int) scanlong();
	}
	
	public long nextLong() throws IOException{
		  return  scanlong();
		}
	
	public double nextDouble() throws IOException{
		  return  scandouble();
		}
	
	public float nextFloat() throws IOException{
		  return (float) scandouble();
		}
	
	public String next() throws IOException{
		return scanstring();
	}
}


// output writer
class Printer{
	private final BufferedWriter bw;
	public Printer(OutputStream out){
		bw = new BufferedWriter(new OutputStreamWriter(out));
	}
	
    public void print(Object...objects) throws IOException{
    	for(int i = 0; i < objects.length; i++){
    		if(i != 0)
    			bw.append(' ');
    		bw.append(objects[i].toString());
    	}
    }
	public void print(String str) throws IOException{
		bw.append(str);
	}
	
	public void println(Object...objects) throws IOException {
		print(objects);
		bw.append("\n");
	}
	
	public void close() throws IOException{
		bw.close();
	}
	
	public void flush() throws IOException{
		bw.flush();
	}
}
/*class InputReader {
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
 
    
    } */