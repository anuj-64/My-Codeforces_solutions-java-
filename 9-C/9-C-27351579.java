import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anuj64
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        String[] ans;
        HashSet<Integer> hs;
        int l;

        public void generate(int i, int j) {
            if (j >= l)
                return;
            ans[2 * i] = ans[i] + "0";
            hs.add(Integer.parseInt(ans[2 * i]));
            generate(2 * i, j + 1);
            ans[2 * i + 1] = ans[i] + "1";
            hs.add(Integer.parseInt(ans[2 * i + 1]));
            generate(2 * i + 1, j + 1);
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            l = Integer.toString(n).length();
            hs = new HashSet<>();
            int res = 0;
            ans = new String[(int) (1e6)];
            ans[1] = "";
            generate(1, 0);
            Integer[] arr = hs.toArray(new Integer[0]);
            //sort(arr);
            for (int i = 0; i < hs.size(); i++) {
                //out.print(arr[i]+" ");
                if (arr[i] <= n)
                    res++;
            }
            out.println(res - 1);
        }

    }

    static class InputReader {
        private byte[] buf = new byte[8000];
        private int index;
        private int total;
        private InputStream in;

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

        public int nextInt() {
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

        public boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
                return true;
            return false;
        }

    }
}