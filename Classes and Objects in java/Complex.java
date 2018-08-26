class ComplexNumber
{
    int real;
    int imaginary;
    ComplexNumber()
    {
        real=2;
        imaginary=5;
    }
    int Display()
    {
        System.out.println("Complex Number : "+real+"+"+imaginary+"i");
        return 0;
    }

}
class Complex
{
    public static void main(String[] args)
    {
        ComplexNumber x=new ComplexNumber();
        x.Display();
    }
}