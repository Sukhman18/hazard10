import java.util.Scanner;
class Movie
{
    String name;
    static String genre;
    static
    {
        genre="Horror";
    }
}
class Demo_Static_Block_2
{
    public static void main(String[] args)
    {
        Movie m1=new Movie();
        m1.name="Insidious";
        Movie m2=new Movie();
        m2.name="Nun";
        System.out.println(m1.name+" is a good "+m1.genre+" movie");
        System.out.println(m2.name+" is a good "+m2.genre+" movie");
    }
}