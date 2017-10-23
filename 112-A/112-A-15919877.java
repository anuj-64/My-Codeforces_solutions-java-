import java.util.*;
import java.math.*;
public class solution {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String p=in.next();
		s=s.toLowerCase();
		p=p.toLowerCase();
		int t=s.compareTo(p);
		if(t>0)
		System.out.println("1");
		else if(t<0)
			System.out.println("-1");
		else
			System.out.println("0");
			}
		}