package co.vinod.uitl;

public class number {

	public long getfibElementsAt(int index){
		if(index< 0)
			return -1;
		int a,b,c=0;
		a=-1;
		b=1;
		for(int i=0;i<=index;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
		}
		
	}

