import java.util.*;
class num
{
	int val;
	num()
	{
		val=-999;
	}
	num(int value)
	{
		this.val=val;
	}
	void setVal(int val)
	{
		this.val=val;
	}
	int getVal()
	{
		return this.val;
	}
	public int hashCode()
	{
		return (10*val)+10;
	}
	public boolean equals(Object o)
	{
		num n=(num)o;
		if(n.getVal()==this.val)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class SameSet
{
	public static void main(String[] args)
	{
		int n1,n2,i;
		Set <num> s=new HashSet<>();
		Set <num> s1=new HashSet<>();
		Scanner st=new Scanner(System.in);
		System.out.println("FOR SET 1 :- ");
		System.out.print("Enter the number of elements :- ");
		n1=st.nextInt();
		System.out.println("Start entering the elements :- ");
		for(i=0;i<n1;i++)
		{
			s.add(new num(st.nextInt()));
		}
		System.out.print("\nSet 1 :- ");
		for(num nu:s)
		{
			System.out.print(nu.getVal()+" ");
		}
		System.out.println("\n");
		System.out.println("FOR SET 2 :- ");
		System.out.print("Enter the number of elements :- ");
		n2=st.nextInt();
		System.out.println("Start entering the elements :- ");
		for(i=0;i<n2;i++)
		{
			s1.add(new num(st.nextInt()));
		}
		System.out.print("\nSet 2 :- ");
		for(num nu:s1)
		{
			System.out.print(nu.getVal()+" ");
		}
		System.out.println("\n");
		System.out.println("Removing elements from s that are not in s1...");
		s.retainAll(s1);
		System.out.println("Removing elements from s1 that are not in s...");
		s1.retainAll(s);
		System.out.println("DONE");
		System.out.println("\nSet 1 :-");
		for(num nu:s1)
		{
			System.out.print(nu.getVal()+" ");
		}
		System.out.println("\n");
		System.out.println("\nSet 2 :- ");
		for(num nu:s1)
		{
			System.out.print(nu.getVal()+" ");
		}
		System.out.println("\n");
		st.close();
	}
}