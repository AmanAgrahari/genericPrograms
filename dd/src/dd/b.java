package dd;

import java.util.Scanner;

public class b {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int k=sc.nextInt();
		int m[]=new int[k];
		int c=1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
		m[i]=0;
		}
		for(int i=0;i<a.length;i++)
		{
			m[(a[i])%k]++;
			for(int j=i+1;j<a.length;j++)
			{
				if(	((a[i]+a[j]))%k==0)
				{
				System.out.println(a[i]+"  "+a[j]+"   "+c);
				c++;
				}
				
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.println(m[i]);
		}
	
	}
}
