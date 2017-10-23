import java.util.*;
import java.math.*;
public class solution {

	public static void main(String[] args) {
		int x=0,sum=0;
		Scanner in=new Scanner(System.in);
	    String s=in.next();
	    for(x=0;x<s.length();x++)
	    {
	    	if(s.charAt(x)=='4'||s.charAt(x)=='7')
	    		sum++;
	    }
	    if(s.length()<4)
	    	System.out.println("NO");
	    else if(sum!=4&&sum!=7&&sum!=44&&sum!=47)
	    System.out.println("NO");
	    else
	    	System.out.println("YES");
	}}