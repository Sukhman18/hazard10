abstract class Vehicle
{
    abstract void Start();
    void Stop()
    {
        System.out.println("Stop");
    }
}
class Two_Wheeler extends Vehicle
{
    void Start()
    {
        System.out.println("Start two wheeler");
    }
    void Stop()
    {
        System.out.println("Stop two wheeler");
    }
}
class Four_Wheeler extends Vehicle
{
    void Start()
    {
        System.out.println("Start four wheeler");
    }
    void Stop()
    {
        System.out.println("Stop two wheeler");
    }
}
class Instructions
{
    public static void main(String[] args)
    {
        Two_Wheeler t=new Two_Wheeler();
        Four_Wheeler f= new Four_Wheeler();
        t.Start();
        t.Stop();
        f.Start();
        f.Stop();
    }
    
}