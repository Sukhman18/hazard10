import java.util.Scanner;
public class Rev
{

  public static void main(String[] args)
{

    Scanner ss=new Scanner(System.in);

    System.out.println("Enter a string");

    String str=ss.nextLine();

    char[] ch=str.toCharArray();

    int i,size=ch.length;

    String re="";

    for(i=size-1;i>=0;i--)
    {
      
    re=re+ch[i];

     }
 
   System.out.print("Reversed string is "+re);

  }

}
