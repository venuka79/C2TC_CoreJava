
import java.util.Scanner;
public class FindingSmallestNumber 
{
	public static void main(String[] args)
	{
	int a,b,c;
	System.out.println("Enter the values of three numbers:");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	if(a<b&&a<c)
		System.out.println("a is small");
	else if(b<c&&b<a)
		System.out.println("b is amall");
	else if(c<a&&c<b)
		System.out.println("c is small");
	}
	
}