import java.util.*;
public class fax
{
    public static void main(String[] args)
    {       
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int s=0;
        int max=0;
        for(int i=0;i<t;i++)
        {   
        int n=in.nextInt();
        int m=in.nextInt();
        s=s+m-n;
        if(max<s)
        	max=s;
        }
     System.out.println(max);  
        
    } }