import java.util.Scanner;

 class GrtString

{
	public static void main(String[] args)

	{

		Scanner s=new Scanner(System.in);

    System.out.println("Enter numbers");

		String str=s.nextLine();

		String str1=s.nextLine();

                int a=Integer.parseInt(str);
		int b=Integer.parseInt(str1);
		System.out.print("Bigger Number is");

		if(a>b)
	
	{

			System.out.println(a);

		}

		else

		{

			System.out.println(b);

		}

	}

}