interface Animalss
{
void speaks();
void eats();
}
class Dog implements Animalss
{
public void speaks()
{
System.out.println("Dog bark");
}
public void eats()
{
System.out.println("Dog eat");
}
}
class Cat implements Animalss
{
public void speaks()
{
System.out.println("Cat meows");
}
public void eats()
{
System.out.println("Cat eat");
}
}
class DogsAndCats
{
public static void main(String[] args)
{
Animalss x=new Dog();
Animalss y=new Cat();
x.speaks();
x.eats();
y.speaks();
y.eats();
}
}