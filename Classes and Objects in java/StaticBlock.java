import java.util.Scanner;
class Student
{
    String name;
    static String college;
    static
    {
        college="Chitkara University";
    }
}
class StaticBlock
{
    public static void main(String[] args)
    {
        Student st1=new Student();
        Student st2=new Student();
		st1.name="Sukhman";
		st2.name="Savar";
        System.out.println(st1.name+" is enrolled in "+st1.college);
        System.out.println(st2.name+" is enrolled in "+st2.college);
    }
}