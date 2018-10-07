import java.util.Scanner;
class Pal
{
int Pa(char[] ar,int i,int j)
{
int flag=0;
if(i>=j)
{
if(ar[i]==ar[j])
{
flag=1;
}
else
{
flag=0;
}
return flag;
}
flag=Pa(ar,++i,--j);
if(flag==0)
{ return 0;}
if(flag==1)
{
if(ar[i]==ar[j])
{
flag=1;
}
else
{
flag=0;
}
}
return flag;
}
}
class Maain
{
public static void main(String[] args)
{
String s=new String();
Scanner ss=new Scanner(System.in);
s=ss.next();
int i=0,g;
int j=s.length()-1;
char[] a=s.toCharArray();
Pal p=new Pal();
g=p.Pa(a,i,j);
if(g==1)
{
System.out.println("Palindrome");
}
else
{
System.out.println("No Palindrome");
}
}
}
