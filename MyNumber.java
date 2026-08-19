import java.util.Scanner;

class MyNumber
{
    private int num;
    public MyNumber()
    {
     num = 0; 
    }
    public MyNumber(int num)
    {
        this.num = num;
    }
    public void check()
    {
        if (num > 0)
        {
            System.out.println("Positive Number");
        }
        else if(num < 0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Zero");
        }
        if(num % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }

        public static void main(String Arg[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number:");

            int n = sc.nextInt();

            MyNumber obj = new MyNumber(n);
            obj.check();
            sc.close();
        }
}