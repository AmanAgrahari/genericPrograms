package co.vinod;

public class program01 {

public static void main(String[] args) {
	
	/*String num1="vinod";//new objects was constructed here
	String num2="vinod";//no new objects here
	System.out.println("equals="+(num1==num2));
num1=num1.toLowerCase();
System.out.println("num1="+num1);

*/
	/*String num1= new String("vinod");
	String num2=new String("vinod");
	System.out.println("equal=" +(num1==num2));
	*/
	/*String num1= new String("vinod");
	String num2=new String("vinod");
	if(num1==num2)
		System.out.println("num1 and num23 are same");
	else
		System.out.println("num1 and num2 are different");
*/
	/*String num1= new String("vinod");
	String num2=new String("vinod");
	if(num1.equals(num2))
		System.out.println("num1 and num23 are same");
	else
		System.out.println("num1 and num2 are different");
*/
	/*String num1="shyam";
	String num2="shyluja";
	int c=num1.compareTo(num2);
	if(c<0)
		System.out.println(num1 + "is less than" + num2);
	else if(c>0)
		System.out.println(num1 + "is greater than" + num2);
	else
	{
		System.out.println(num1 + "is equal to" + num2);
	}
*/
	/*String haystick="the quick brown fox jumps over a lazy fox dog";
	String needle="fox";
	int c=haystick.indexOf(needle);
	System.out.println("index="+c);
	int k=-1;
	int count=0;
	while((k=haystick.indexOf(needle,k+1))!=-1)
	{
		count++;
	}
	System.out.println("the word" +needle +"is found" +count+"times");
*/
	String str="";
	str=str.concat("vinod").concat(" ").concat("banglore");
System.out.println(str);
}
}
