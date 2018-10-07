import java.util.Scanner;
public class Case
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String st= s.nextLine();
		st=st.trim();
		int j,i,flag=0;
		char[] c=st.toCharArray();
		for(i=0;i<c.length;i++)
		{
			if(Character.isUpperCase(c[i]))
				c[i]=Character.toLowerCase(c[i]);
			else
				c[i]=Character.toUpperCase(c[i]);
		}
		System.out.print("new string is");
		for(i=0;i<c.length;i++)
			System.out.print(c[i]);
	}
}