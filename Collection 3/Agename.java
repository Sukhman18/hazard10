import java.util.*;
import java.io.*;

class Stu
{
	int age;
	String name;
	public Stu(int age, String name)
   {
   this.age=age;
   this.name=name;
   }
   public String toString()
   {
   return this.age + " " + this.name;
   }
}
class Sortage implements Comparator<Stu>
{
public int compare(Stu a,Stu b)
{
Stu s1=(Stu)a;
Stu s2=(Stu)b;

if(s1.age==s2.age)
return 0;
else if(s1.age>s2.age)
return 1;
else
return -1;
 }
}
class Sortname implements Comparator<Stu>
{
	public int compare(Stu a, Stu b)
	{
      return a.name.compareTo(b.name);
	}
}
class AgeName
{
	public static void main(String[] args)
	{
      ArrayList<Stu> a1 =new ArrayList<Stu>();
      a1.add(new Stu(21,"Vishwas\t"));
      a1.add(new Stu(20,"Sumit\t"));
      a1.add(new Stu(22,"Sukhdev\t"));
      a1.add(new Stu(19,"Savar\t"));

      System.out.println("Unsorted");
      for(int i=0;i<a1.size();i++)
      System.out.println(a1.get(i));

      Collections.sort(a1,new Sortage());

      System.out.println("\nSorted by age");
      for(int i=0;i<a1.size();i++)
      System.out.println(a1.get(i));

      Collections.sort(a1,new Sortname());

      System.out.println("\nSorted by name");
      for(int i=0;i<a1.size();i++)
      System.out.println(a1.get(i));

	}
}