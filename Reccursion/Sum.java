import java.util.Scanner;

public class Sum

{

	public static void main(String[] args)

	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter String ");

		String st=s.nextLine();

		int a=re(st);

		System.out.println("The result is "+a);

	}

	static int re(String st)

	{
 
       int x=0;

		if(st.length()==0)

			return 0;

        if((st.charAt(0))>=48&&(st.charAt(0))<=57)

        {

            x=st.charAt(0)-48+re(st.substring(1));

            return x;

        }
 
       x=re(st.substring(1));

        return x;

	}

}