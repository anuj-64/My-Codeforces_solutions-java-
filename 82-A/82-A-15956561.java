import java.util.*;
import java.math.*;
public class solution {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int j=0,a=0;
        while(n!=0){
            if(n <= (5* Math.pow(2, j)))
                    { 
                       a=(int) Math.ceil(n / Math.pow(2,j));
                       n=0;
                    }
            else
                  n = n - 5*(int)Math.pow(2, j);
            j++;
          }
        
        if(a==1)
        	System.out.println("Sheldon");
        else if(a==2)
        	System.out.println("Leonard");
        else if(a==3)
       System.out.println("Penny");
        else if(a==4)
        	System.out.println("Rajesh");
        else if(a==5)
        	System.out.println("Howard");
        else
        	System.out.print("00");
        
	}}