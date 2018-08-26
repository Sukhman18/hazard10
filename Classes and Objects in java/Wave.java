import java.util.Scanner;
class Wave
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,j,tp;
        int flag=0;
        int[] Arr=new int[10];
        System.out.println("Enter the elements");
        for(i=0;i<10;i++)
        {
            Arr[i]=s.nextInt();
        }
        for(i=0;i<10;i++)
        {
            flag++;
            if(flag==2)
            {
                tp=Arr[i-1];
                Arr[i-1]=Arr[i];
                Arr[i]=tp;
                flag=0;
            }
        }
        System.out.println("Final Array:");
        for(i=0;i<10;i++)
    {
        System.out.println(Arr[i]);
    }
    }
}