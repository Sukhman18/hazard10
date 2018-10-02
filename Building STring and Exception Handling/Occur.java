import java.util.Scanner;

public class Occur
{

  public static void check(String s,String s1)
{
    int a=s.length();

    int b=s1.length();

    char[] ch=s.toCharArray();
    char[] ch1=s1.toCharArray();
    int i,j=0,o=0,flag=0;

    for(i=0;i<a-b;i++)
{
  
j=0;   
if(ch[i]==ch1[j]) 
{
++j;
while(j<b)
{
if(ch[i+j]==ch1[j])
{
flag=1;
}
else
{
flag=0;
break;
}
++j;
}
}
if(flag==1)
{
System.out.println("Substring Exists");
break;
}
{
System.out.println("Substring doesn't exist");
break;
}
}
}

  public static void main(String[] args)
{
    
Scanner ss=new Scanner(System.in);

    System.out.println("Enter a string");

    String s=ss.nextLine();

    System.out.println("Enter the string to check occurrence in the first string");

    String s1=ss.nextLine();

    check(s,s1);

  }

}