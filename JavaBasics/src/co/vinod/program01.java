package co.vinod;
import java.util.*;
public class program01 {
	
	//static  String Array[]={" Hello " , " This " , "is ", "Sorting ", "Example"};
	String  temp; 

	public static void main(String[] args)
	{
		

	        Scanner sc = new Scanner(System.in);
	         
	        System.out.print("Enter a sentence : \t");
	       String s = sc.nextLine();
	       String s2= s+" ";
	       int l=s2.length();
	        int d;
	        String s1="";
	        for(int i=0;i<l;i++)
	        {
	        	d=s2.charAt(i);
	        	if(d==32)
	        	{ 		
	        		System.out.println(s1);
	        		s1="";
	        	}
	        	else
	        	{
	        		d=d+1;
	        		if(d==123)
	        		{
	        			s1=s1+"a";
	        		}
	        		else
	        		{
	        			s1=s1+(char)d;
	        		}
	        	
	        	}
	        }
	       // 004
	        //String part2 = parts[1]; // 034556
	       /* String s2= s+ " ";
	        // s," .,?!"
	        int l=s2.length();
	        char d;
	        String s1="";
	        String w="";
	        for(int i=0;i<l;i++)
	        {
	        	d=s2.charAt(i);
	        	if(d!=' ')
	        	{
	        	s1=s1+d;
	        	w=d+w;
	        	}
	        	else
	        	{
	        	System.out.println(s1+"\t"+w);
	        	s1="";
	        	w="";
	        	}
	        }*/
	  
	}
	}


