import java.util.*;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////SOLUTION ///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




public  class Solution

{    
   //main
	public static void main(String[] args){
	Scanner in=new Scanner (System.in) ;
	String s=in.next();
	String  str="";
	int count=0;
	int sx= s.charAt(0)-'a'+1;
	int sy=Integer.parseInt(""+s.charAt(1));
	s=in.next();
	int dx=s.charAt(0)-'a'+1;
	int dy=Integer.parseInt(""+s.charAt(1));
	
	while(sx!=dx||sy!=dy){
		count++;
		if(dy>sy && dx>sx){
			str=str+"RU"+" ";
			sy++;sx++;
		}
		else if(dy>sy && dx<sx){
			str=str+"LU"+" ";
			sy++;sx--;
		}
		else if(dy<sy && dx>sx){
			str=str+"RD"+" ";
			sy--;sx++;
		}
		else if(dy<sy && dx<sx){
			str=str+"LD"+" ";
			sy--;sx--;
		}
		else if(dy<sy){
			str=str+"D"+" ";
			sy--;
		}
		else if(dy>sy){
			str=str+"U"+" ";
			sy++;
		}
		else if(dx<sx){
			str=str+"L"+" ";
			sx--;
		}
		else if(dx>sx){
			str=str+"R"+" ";
			sx++;
		}
	}
	
   String[] sr=new String[count];
   sr=str.split(" ");
   System.out.println(count);
   for(int i=0;i<count;i++)
	   System.out.println(sr[i]);
}//void main

}//class main