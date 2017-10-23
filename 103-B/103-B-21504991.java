import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;



/*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/
/*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ CONTROLLER CLASS   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
/*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/


public class Main {
	public static void main(String[] args) throws Exception {
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}

static class TaskA {
	

	
/*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/
/*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ OTHER USEFULL METHODS ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
/*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/
		// GCD && LCM
		long gcd(long a, long b) {
			return b == 0 ? a : gcd(b, a % b);
		}

		long lcm(long a, long b) {
			return a * (b / gcd(a, b));
		}

		// REverse a String
		String rev(String s) {
			return new StringBuilder(s).reverse().toString();
		}
        
/*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/
/*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ SOLUTION  IS RIGHT HERE^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
/*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/
	
	
		public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
			// BufferedReader br = new BufferedReader(new
			// InputStreamReader(System.in));
			// Scanner sc = new Scanner(System.in);
			
			//final long mod = (long)1e9+7;
			int n = in.nextInt() , m = in.nextInt();
			dsu u = new dsu(n);
			for(int i = 0; i < m; i++)
				u.union(in.nextInt(), in.nextInt());
			if(u.cnt() == 1 && n == m)
				out.println("FHTAGN!");
			else out.println("NO");
		}
	}

/*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/
/*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ OTHER USEFULL CLASSES ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
/*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/
//union
static class dsu{
	 int[] union , size;
	 int count; 
	 public dsu(int n){
		 count = n;
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
		 if(ea == eb);
		 else if(size[ea] > size[eb]){
			 union[eb] = ea;
			 size[ea] += size[eb];
			 count--;
		 }else{
			union[ea] = eb;
			size[eb] += size[ea];
			count--;
		 }
		 //System.out.println(count);
	 }
	 public int cnt(){
		 //System.out.println(count);
		 return count;
	 }
	 
}


 /*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/
 /*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ INPUT READER CLASS ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
 /*``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````*/
	


    static class InputReader {
		private byte[] buf = new byte[8000];
		private int index;
		private int total;
		private InputStream in;
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public InputReader(InputStream stream) {
			in = stream;
		}

		public int scan() {
			if (total == -1)
				throw new InputMismatchException();
			if (index >= total) {
				index = 0;
				try {
					total = in.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (total <= 0)
					return -1;
			}
			return buf[index++];
		}

		public long scanlong() {
			long integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}

		private int scanInt() {
			int integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}

		public double scandouble() {
			double doubll = 0;
			int n = scan();
			int neg = 1;
			while (isWhiteSpace(n))
				n = scan();
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doubll *= 10;
					doubll += n - '0';
					n = scan();
				}
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doubll += (n - '0') * temp;
						n = scan();
					}
				}
			}
			return neg * doubll;
		}

		private float scanfloat() {
			float doubll = 0;
			int n = scan();
			int neg = 1;
			while (isWhiteSpace(n))
				n = scan();
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doubll *= 10;
					doubll += n - '0';
					n = scan();
				}
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doubll += (n - '0') * temp;
						n = scan();
					}
				}
			}
			return neg * doubll;
		}

		public String scanstring() {
			StringBuilder sb = new StringBuilder();
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			while (!isWhiteSpace(n)) {
				sb.append((char) n);
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

		public boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
		/// Input module

		public int nextInt() {
			return scanInt();
		}

		public long nextLong() {
			return scanlong();
		}

		public double nextDouble() {
			return scandouble();
		}

		public float nextFloat() {
			return scanfloat();
		}

		public String next() {
			return scanstring();
		}

		public String nextLine() throws IOException {
			return scan_nextLine();
		}

		public int[] readIntArray(int size) {
			int[] array = new int[size];
			for (int i = 0; i < size; i++) {
				array[i] = nextInt();
			}
			return array;
		}
	}
 
}