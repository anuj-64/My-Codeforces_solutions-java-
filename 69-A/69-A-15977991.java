import java.util.*;
import java.io.*;
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int a=in.nextInt();
	    int x=0,y=0,z=0;
	    for(int i=0;i<a;i++){
	    	x=x+in.nextInt();
	    	y=y+in.nextInt();
	    	z=z+in.nextInt();
	    }
	    if(x==0&&y==0&&z==0)
	    System.out.println("YES");
	    else
	    	System.out.println("NO");
	}
}