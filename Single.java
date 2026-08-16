
class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    public void Fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base 
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived constructor");
    }
    public void Gun()
    {
        System.out.println("inside Derived gun");
    }
}

class Single 
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        dobj.Fun();
        dobj.Gun();
    }
}