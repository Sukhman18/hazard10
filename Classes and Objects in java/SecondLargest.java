import java.util.Scanner;
class SecondLargest
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,j,tp;
        int flag=1;
        int[] Arr=new int[10];
        System.out.println("Enter the elements");
        for(i=0;i<10;i++)
        {
            Arr[i]=s.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=i;j<10;j++)
            {
                if(Arr[j]>Arr[i])
                {
                    tp=Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=tp;
                }
            }
        }
    for(i=0;i<10;i++)
    {
        if(flag==0)
        {
            System.out.println("Second Largest element : "+Arr[i]);
        }
        flag--;
    }
    }
}