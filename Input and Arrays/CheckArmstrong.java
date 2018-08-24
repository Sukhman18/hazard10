import java.util.Scanner;
import java.lang.Math;
class CheckArmstrong
{
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=s.nextInt();
            int m=100,n=num;
            int cnt=0,am=0;
            while(n>0)
            {
                m=n%10;
                cnt++;
                n=n/10;
            }
            n=num;
            while(n>0)
            {
                m=n%10;
                am+=Math.pow(m,cnt);
                n=n/10;
            }
            if(num==am)
            {
                System.out.println(num+" is an Armstrong number");
            }
            else
            {
                System.out.println(num+" is not an Armstrong number");
            }
        }
}