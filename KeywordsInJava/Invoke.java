class Parent
{
    void DoStuff()
    {
        System.out.println("Dostuff function of parent executed");
    }
}
class Child extends Parent
{
    void DoStuff()
    {
        super.DoStuff();
    }
}
class Invoke
{
    public static void main(String[] args)
    {
        Child a=new Child();
        a.DoStuff();
    }
}