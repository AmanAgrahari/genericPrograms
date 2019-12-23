package dd;

public class a {

public static void main(String[] args)
{
	int a[]= {23,16,12,8,44,32,2};
	int k=4;
	int m[]={0,0,0,0};
	for(int i=0;i<7;i++)
	{
		m[a[i]%k]++;
	}
	for(int i=0;i<4;i++)
	{
		System.out.println(m[i]);
	}
	
	int sum=0;
	sum=sum+(m[0]*(m[0]-1)/2);
	System.out.println(sum);
for(int i=1;((i<=k/2)&&(i!=k-1));i++)
{
sum=sum+m[i]*m[k-1];	
}
if(k%2==0)
{
	sum=sum+(m[k/2]*(m[k/2]-1))/2;
}
System.out.println(sum);


}
}