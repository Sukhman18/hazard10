import java.util.Scanner;

public class Pow

{

	public static void main(String[] args)

	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter number");

		int n=s.nextInt();

		System.out.println("Enter other number ");

		int q=s.nextInt();

		int p=re(n,q);

		System.out.println("The result  :"+p);

	}

	static int re(int a,int b)

	{

		if(b==1)

			return a;

        return a*re(a,b-1);

	}

}