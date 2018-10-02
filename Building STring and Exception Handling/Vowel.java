import java.util.Scanner;

class Vowel
{

  public static void main(String[] args)
{

    Scanner ss=new Scanner(System.in);

    System.out.println("Enter a string");

    String str=ss.nextLine();

    char[] ch=str.toCharArray();

    char[] ch1=new char[str.length()];
    char temp;

    int i,size=ch.length,j=0,flag=0;

    for(i=0;i<size;i++)
{

flag=1;
      if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
{
flag=0;
}
if(flag!=0)
{
ch1[j]=ch[i];
++j;
}
}
String s2=new String(ch1);
System.out.println(s2);
   }

}