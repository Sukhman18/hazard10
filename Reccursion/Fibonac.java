import java.util.Scanner;

public class Fibonac

{

	public static void main(String[] args)

	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the value of n: ");

		int n=s.nextInt();

		int a=fib(n);

		System.out.println("The nth term is"+a);

	}

	static int fib(int n)

	{

		if(n==1)

		return 0;

		else if(n==2)

			return 1;

		return fib(n-1)+fib(n-2);
	
        }

}