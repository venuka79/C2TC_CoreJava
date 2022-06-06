import java.io.*;
public class PositiveOrNegative
{
		public static void main(String[] args)throws IOException
		{
			BufferedReader PosNeg=new BufferedReader(new InputStreamReader(System.in));
			String m;
			int n,Pos,Neg,Zer;
			Pos=Neg=Zer=0;
			System.out.println("Enter any Number:");
				m=PosNeg.readLine();
				n=Integer.parseInt(m);
				if(n==0)Zer++;
				if(n<0)Neg++;
				if(n>0)Pos++;
			System.out.println("The positive Numbers are:"+Pos);
			System.out.println("The Negative Numbers are:"+Neg);
			System.out.println("The Zero Values are:"+Zer);
			
			
		}

	}