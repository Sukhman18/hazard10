import java.util.Scanner;

 class Words
{

  public static void main(String[] args)
{

    Scanner s=new Scanner(System.in);

    System.out.println("Enter a string");

    String str=s.nextLine();

    int word=0,i,j;

    char[] ch=str.toCharArray();

    int size=ch.length;

    for(i=0;i<size;i++)
{

      if(ch[i]==' ')
{
        word++;
      }

    }

    if(str.length()==0)
{

      System.out.println("Empty String");

    }

    else
{
      System.out.println("Words are "+(word+1));
    }
  }
}