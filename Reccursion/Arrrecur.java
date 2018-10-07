import java.util.Scanner;

public class Arrrecur

{

    public static void main(String[] args)

    {

        Scanner s=new Scanner(System.in);

        System.out.print("Enter the size of array:");
 
       int n=s.nextInt();

        int[] a=new int[n];

        for(int i=0;i<n;i++)

        {

            System.out.print("Enter element");

            a[i]=s.nextInt();

        }

        System.out.print("Enter element to search ");

        int e=s.nextInt();

        boolean re=search(a,e,a.length);

        System.out.println("The search result"+re);

        if(re==true)

            System.out.print("The element is:"+e);

    }

    static boolean search(int[] a,int e,int l)

    {

        if(l==0)

            return false;

        else if(a[l-1]==e)

            return true;

        return search(a,e,l-1);
    }

}