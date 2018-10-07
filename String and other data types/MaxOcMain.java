import java.util.Scanner;
class MaxOc
{
void MaxChe()
{
String s=new String();
Scanner ss=new Scanner(System.in);
s=ss.next();
char[] a=s.toCharArray();
int max=0,pos=0,i,j,pre=0;
for(i=0;i<a.length;i++)
{
max=0;
for(j=0;j<a.length;j++)
{
if(a[i]==a[j])
{
++max;
}
}
if(max>pre)
{
pre=max;
pos=i;
}
}
System.out.println(a[pos]+" occurs max no. of times");
}
}
class MaxOcMain
{
public static void main(String[] args)
{
MaxOc n=new MaxOc();
n.MaxChe();
}
}