import java.util.Scanner;
public class thsq {
	

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		long n=in.nextInt();
		long m=in.nextInt();
		long a=in.nextInt();
		double s=(double)n/a;
		double t=(double)m/a;
		double x=Math.ceil(s);
		double y=Math.ceil(t);
		double w=x*y;
		System.out.println((long)w);
		

	}

}