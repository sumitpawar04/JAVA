import java.util.Scanner;

class MenuProgram
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Volume of Cylinder");
        System.out.println("2. Factorial");
        System.out.println("3. Armstrong Number");
        System.out.println("4. Exit");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Enter radius :");
                double r = sc.nextDouble();
                System.out.println("Enter height :");
                double h = sc.nextDouble();

                double volume = 3.14 * r * r * h;
                System.out.println("Volume = "+volume);
            break; 

            case 2:
                System.out.println("Enter a number :");
                int n = sc.nextInt();
                int fact = 1;
                for(int i = 1; i <= n; i++)
                {
                    fact = fact * i;
                }
                System.out.println("Factorial = "+fact);
            break;

            case 3:
                System.out.print("Enter a number:");
                int num = sc.nextInt();
                int temp = num;
                int sum = 0;
                while(temp > 0)
                {
                    int digit = temp % 10;
                    sum = sum +(digit * digit * digit);
                    temp = temp / 10;
                }
                if (sum == num)
                {
                    System.out.println("Armstrong Number");
                }
                else
                {
                    System.out.println("Not an Armstrong Number");
                }
            break;

            case 4:
                System.out.println("Program Ended");
            break;
    
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
