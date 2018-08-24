import java.util.Scanner;
class FindPrimeSeq
{
    public static void main(String[] args)
    {
        int i,j;
        int fl=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println("Prime Numbers:");
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    fl+=1;
                }
            }
            if(fl<=2 && i!=1)
            {
                System.out.println(i);
            }
            fl=0;
        }
    }
}