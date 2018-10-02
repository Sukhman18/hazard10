import java.util.Scanner;

public class Subst
{

  public static void main(String[] args)
{

    Scanner ss=new Scanner(System.in);

    System.out.println("Enter a string");

    String str=ss.nextLine();

    char[] ch=str.toCharArray();
    int size=str.length();

    int i,j,k;

    System.out.println("Substrings are");
 
   for(i=0;i<size;i++)
{

      for(j=0;j<=i;j++)
{


       for(k=j;k<=i;k++)
{
System.out.print(ch[k]);
}
System.out.println();       
      }

    }

  }

}