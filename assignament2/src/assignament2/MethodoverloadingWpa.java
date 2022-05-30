package assignament2;

public class MethodoverloadingWpa {
	static int add(int a,int b)
	{
		return a+b;
	}  
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}  
	public static void main(String[] args) {
		System.out.println(MethodoverloadingWpa.add(11,11));  
		System.out.println(MethodoverloadingWpa.add(12,11,11));  
	}

}
