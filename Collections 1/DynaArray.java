import java.util.*;
class Arrayli
{
		private int a[];
		private int siz;
		private int osize;
		private int index;
		Arrayli(int siz)
		{
			this.siz=siz;
			osize=siz;
			index=-1;
			a=new int[siz];
		}
		public void traverse()
		{
			if(index==-1)
				System.out.println("List is empty.");
			else
			{
				for(int i=0;i<=index;i++)
					System.out.print(a[i]+" ");
				System.out.println();
			}
		}
		public void add(int data)
		{
			if(index==siz-1)
			{
				int temp[]=a;
				this.siz=(int)(this.siz*1.5);
				a=new int[this.siz];
			}
			index++;
			a[index]=data;
		}
		public int getIndex()
		{
			return index;
		}
		public void delete(int data)
		{
			if(index==-1)
				System.out.println("List is empty.");
			else
			{
				int  pos=-1;
				for(int i=0;i<=index;i++)
				{
					if(a[i]==data)
					{
						pos=i;
						break;
					}
				}
				if(pos==-1)
					System.out.println(data+" was not found in the arraylist.");
				else
				{
					for(int i=pos;i<index;i++)
						a[i]=a[i+1];
					a[index]=-999;
					index--;
				}
			}
		}
		public void deleteall()
		{
			if(index==-1)
				System.out.println("List is already empty.");
			else
			{
				System.out.println("> Before deletion,no. of elements = "+(getIndex()+1));
				index=-1;
				a=new int[osize];
				System.out.println("> After deletion,no. of elements = "+(getIndex()+1));
			}
		}
}
class DynaArray
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no. of elements : ");
		int i,n=s.nextInt(),choice;
		Arrayli all=new Arrayli(n);
		System.out.println("\nStart entering the elements :- ");
		for(i=0;i<n;i++)
		{
			all.add(s.nextInt());
		}
		System.out.println("What do you want next?");
		System.out.println("----------------------");
		System.out.println("Inserting a number.");
		System.out.println("Deleting a number.");
		System.out.println("Deleting all the elements.");
		System.out.println("Display the array.");
		System.out.println("Exit");
		System.out.println("----------------------");
		System.out.println("Enter choice  ");
		choice=s.nextInt();
		while(choice!=5)
		{
			switch(choice)
			{
				case 1:
				System.out.println("//Enter the number to insert :");
				all.add(s.nextInt());
				System.out.println("> Done.");
				break;
				case 2:
				System.out.println("//Enter the number to delete :");
				all.delete(s.nextInt());
				System.out.println("> Done.");
				break;
				case 3:
				System.out.println("//Deleting all the elements.");
				all.deleteall();
				System.out.println("> Done.");
				break;
				case 4:
				all.traverse();
				break;
				default:
				System.out.println("> Invalid option.");
			}
			System.out.println("-----------------------");
			System.out.println("Enter choice : ");
			choice=s.nextInt();
		}
	}
}