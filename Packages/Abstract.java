
abstract class Animals
{
  String breed,color,name;

  abstract void eat(String b,String c,String n);

  void speak()
{

    System.out.println("Animals speak");

  }

}

class Dog extends Animals
{

  void eat(String b,String c,String n)
{
    
   breed=b;

    color=c;

    name=n;

    System.out.println("Name is "+name+"  Breed is "+breed+" And Color is "+color);

  }

  void speak()
{

    System.out.println("Dogs bark");

  }

}

public class Abstract
{

  public static void main(String[] args)
{

    Animals go=new Dog();

    go.eat("Golden","Glock","Sendy");

    go.speak();

  }

}
