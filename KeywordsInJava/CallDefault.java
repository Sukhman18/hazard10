class Test
{
    Test()
    {
        System.out.println("In default constructor");
    }
    Test(String a)
    {
        this();
        System.out.println("In parameterized constructor");
    }
}
class CallDefault
{
    public static void main(String[] args)
    {
        Test t=new Test("Hello");
    }
}