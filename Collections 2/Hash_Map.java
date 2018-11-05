import java.util.*;
class Stu
{
	private int id;
	Stu(int id)
	{
		this.id=id;
	}
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	public boolean equals(Object o)
	{
		Stu s=(Stu)o;
		if(s.getId() == this.id)
			return true;
		else
			return false;
	}
	public int hashCode()
	{
		return (id*10)+10;
	}
}
class Hash_Map
{
	public static void display(Map <Stu,String> hm)
	{
		System.out.println("HASHMAP :- ");
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry m=(Map.Entry)it.next();
			System.out.println("ID : "+((Stu)m.getKey()).getId()+"\t");
		    System.out.println("NAME : "+m.getValue());
		}
		System.out.println("\n");
	}
	public static void main(String[] args)
	{
		Map<Stu,String> hm=new HashMap<>();
		Scanner s=new Scanner(System.in);
		int n,i,id;
		String name;
		System.out.print("Enter the number of elements : ");
		n=s.nextInt();
		System.out.println("Start entering the ID followed by names :- ");
		for(i=0;i<n;i++)
		{
			id=s.nextInt();
			name=s.nextLine();
			hm.put(new Stu(id),name);
		}
		display(hm);
		System.out.println("Now,we will replace the value for a particular value of key...");
		System.out.print("Enter the ID : ");
		id=s.nextInt();
		System.out.print("Enter the name : ");
		s.nextLine();
		name=s.nextLine();
		hm.put(new Stu(id),name);
		System.out.println("Updated Successfully");
		display(hm);
		s.close();
	}
}