import java.util.Scanner;
class ArraySearch
{
    public static void main(String[] args)
    {
        int temp,x,y;
        int flag=0;
        Scanner s=new Scanner(System.in);
        int[] A=new int[]{1,4,6,7,8,9,10};
        System.out.println("Enter Integer to search");
        int num=s.nextInt();
        for(x=0;x<A.length;x++)
        {
            if(num==A[x])
            {
                System.out.println("Integer found at position (Starting from zero) : "+x);
                flag=1;
                break;
            }

        }
        if(flag==0)
        {
            System.out.println("Integer doesn't exist in array");
        }
    }
}