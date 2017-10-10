import java.util.*;

public class fax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       for(int i=0;i<t;i++){
    	   String s=in.next();
    	   int q=s.length();
    	   if(q<=10)
    		   System.out.println(s);
    	   else
    	   { System.out.print(s.charAt(0));
    	     System.out.print(q-2);
    	     System.out.print(s.charAt(q-1));
    	     System.out.println();
    	   }
       }
	}

}