import java.util.*;

public class fax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       if(t%2==0&&t>=4)
    	   System.out.println("YES");
       else
    	   System.out.println("NO");
	}

}