import java.util.*;
public class Solve {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String S=in.next();
		String a="0000000";
		String b="1111111";
		int f=0,g=0;
		g=S.indexOf("0000000");
		f=S.indexOf("1111111");
		if(f>=0)
			System.out.println("YES");
		else if(g>=0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}