class Animal
{
    String breed,color;
    void Speak()
    {
        System.out.println("Animal's Voice");
    }
}
class Dog extends Animal
{
    void Speak()
    {
        System.out.println("Dog Barks");
        breed="Retriever";
        color="Black";
    }
}
class Cat extends Animal
{
    void Speak()
    {
        System.out.println("Cat Meows");
        breed="Khao Manee";
        color="White";
    }
}
class Animal_Info
{
    public static void main(String[] args)
    {
        Dog o1=new Dog();
        Cat vaan=new Cat();
        o1.Speak();
        System.out.println("I own a dog named Lola. He is a "+o1.breed+" and is "+o1.color+" in color." );
        knobi.Speak();
        System.out.println("I also own a cat named Hero. She is a "+vaan.breed+" and is "+vaan.color+" in color." );
    }
}