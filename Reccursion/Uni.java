import java.util.Scanner;

public class Uni

{

	public static void main(String[] args)

	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter String ");

		String st=s.nextLine();

		String st1=re(st);

		System.out.println("The result is "+st1);

	}

	static String re(String st)

	{

		if(st.length()==1)

			return st;

        String st2=st.substring(1);

        String st1="";

        if(st.charAt(0)!=st2.charAt(0))

        {

            st1+=st.charAt(0)+re(st2);

            return st1;

        }

        else

        {

            st1=re(st2);

            return st1;

        }

	}

}