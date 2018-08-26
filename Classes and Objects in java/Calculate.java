import java.util.Scanner;
class Shape
{
    int length;
    int breath;
    int CalculateArea(int length,int breath)
    {
        int area_shape;
        area_shape=length*breath;
        return area_shape;
    }

}
class Calculate
{
    public static void main(String[] args)
    {
        Shape rect=new Shape();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length");
        rect.length=s.nextInt();
        System.out.println("Enter the breath");
        rect.breath=s.nextInt();
        int area=rect.CalculateArea(rect.length,rect.breath);
        System.out.println("Area is: "+area);
    }
}