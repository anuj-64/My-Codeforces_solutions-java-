import java.util.*;
import java.math.*;
public class solution {

	public static void main(String[] args) {
		int sum=0;
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char ch='h';
		char g='p';
		int[] gh=new int[5];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch){
				if(ch=='h')
				{g=ch;	ch='e';gh[0]=1;}
				else if(ch=='e')
					{g=ch;ch='l';gh[1]=1;}
				else if(g!='l'&&ch=='l')
				{g=ch;ch='l';gh[2]=1;}
				else if(g=='l'&&ch=='l')
				{g=ch;ch='o';gh[3]=1;}
				else if(ch=='o')
				{gh[4]=1;}
				else
					System.out.print("");
			}
		}
		if(gh[0]==1&&gh[1]==1&&gh[2]==1&&gh[3]==1&&gh[4]==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}}