import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args)
	{
		int num,m,cnt=0;
		int r=0;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter an Integer");
		num=n.nextInt();
		m=num;
		while(m!=0)
		{
			cnt++;
			m=m/10;
		}
		for (int i=0;i<cnt;i++)
		{
			r=r*10;
			r=r+num%10;
			num=num/10;
		}
		System.out.println("Reverse of the number is "+r);
	}
}