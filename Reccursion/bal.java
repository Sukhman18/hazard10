import java.util.Scanner;

public class bal

{

	public static void main(String[] args)

	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the String: ");

		String st=s.nextLine();

		int s1=re(st);

        if(s1==0)

		    System.out.println("Balanced");

        else

            System.out.println("Not Balanced");

	}

	static int re(String st)

	{

        int c=0;

        if(st.length()==0)

            return 0;

        if(st.charAt(0)=='('||st.charAt(0)=='{'||st.charAt(0)=='[')

        {

            c=1+re(st.substring(1));

            return c;

        }
 
       else

        {

            c=re(st.substring(1))-1;

            return c;

        }

	}

}