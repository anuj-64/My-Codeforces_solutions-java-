import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.Format;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
 
public class Main {
	public static void main(String[] args){
		InputReader in = new InputReader(System.in);
		Printer out = new Printer(System.out);
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
	void sieve(int UB){
	//	ar = new ArrayList();
		bs = new boolean[UB+1];
		bs[0] = bs[1] = true;
		for(int i = 2; i*i <= UB; i++){
			if(!bs[i]){
				for(int j = i*i ; j <= UB ; j += i)
					bs[j] = true;
			}
		}
		/* for(int i = 2; i <= UB; i++){
		      if(!bs[i])ar.add(i);
		}*/
	}
	
	
	
	
	
	
	
	
	/*          SOLUTION  IS RIGHT HERE     */
	public void solve(int testNumber, InputReader in, Printer out) {
		 // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 // Scanner sc = new Scanner(System.in);
		
		int n = in.nextInt();
		out.print(n+" ");
		for(int i = 2; i*i <= n; i++){
			while(n % i == 0){
				n /= i;
				out.print(n+" ");
			}
		}
		if(n != 1)
			out.print(1);
		 
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
}


// output writer
static class Printer{
	private final BufferedWriter bw;
	public Printer(OutputStream out){
		bw = new BufferedWriter(new OutputStreamWriter(out));
	}
	
    public void print(Object...objects){
    	for(int i = 0; i < objects.length; i++){
    		if(i != 0)
				try {
					bw.append(' ');
				} catch (IOException e) {
					e.printStackTrace();
				}
    		
    		try {
				bw.append(objects[i].toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
	public void print(String str) {
		try {
			bw.append(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void println(Object...objects) {
		print(objects);
		try {
			bw.append("\n");
		} catch (IOException e) {
		   e.printStackTrace();
		}
	}
	
	public void close(){
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void flush() throws IOException{
		bw.flush();
	}
}

static class IOUtils {
    public static int[] readIntArray(InputReader in, int size)  {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }
  }
}