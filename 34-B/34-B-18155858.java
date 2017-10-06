import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
static class FastScanner {

BufferedReader reader;
StringTokenizer tokenizer;

public FastScanner(InputStream stream) {
this.reader = new BufferedReader(new InputStreamReader(stream));
}

public int nextInt() throws IOException {
return Integer.parseInt(next());
}

public int[] nextIntegerArray(int n) throws IOException {
int[] a = new int[n];
for (int i = 0; i < a.length; i++) {
a[i] = nextInt();
}
return a;
}

public long[] nextLongArray(int n) throws IOException {
long[] a = new long[n];
for (int i = 0; i < a.length; i++) {
a[i] = nextLong();
}
return a;
}

public int nextInt(int radix) throws IOException {
return Integer.parseInt(next(), radix);
}

public long nextLong() throws IOException {
return Long.parseLong(next());
}

public long nextLong(int radix) throws IOException {
return Long.parseLong(next(), radix);
}

public double nextDouble() throws IOException {
return Double.parseDouble(next());
}

public BigInteger nextBigInteger() throws IOException {
return new BigInteger(next());
}

public BigInteger nextBigInteger(int radix) throws IOException {
return new BigInteger(next(), radix);
}

public String next() throws IOException {
if (tokenizer == null || !tokenizer.hasMoreTokens()) {
tokenizer = new StringTokenizer(reader.readLine());
return this.next();
}
return tokenizer.nextToken();
}

public void close() throws IOException {
this.reader.close();
}
}

                   //SOLUTION //


	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException{
    new Main().solve();
    }//void main
	
	void solve() throws IOException{
		int n = in.nextInt(), m = in.nextInt(),count=0;
		int[] arr = in.nextIntegerArray(n);
		Arrays.sort(arr);
		
		for(int i=0; i < m ; i++){
			if(arr[i]<0)count+=arr[i];
			else break;
		}
		out.println(-count);
	     in.close();
	     out.flush();
		 out.close();
	}
}