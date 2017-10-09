import java.util.*;

public class fax {

	public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int m=in.nextInt();
       int n=in.nextInt();
       System.out.println((int)Math.floor((double)(m*n/2)));
	}

}