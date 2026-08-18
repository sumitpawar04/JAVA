public class MyClass
{
    int num;
    public static void main(String[] args)
    {
        MyClass m1 = new MyClass();
        m1.num = 0;
        if(args.length > 0)
        {
            int n = Integer.parseInt(args[0]);
            MyClass m2 = new MyClass();
            m2.num = n;
            System.out.println(m1.num);
            System.out.println(m2.num);
        }
        else 
        {
            System.out.println("Insufficient arguments");
        }
    }
}