import java.util.Scanner;

class MenuExample
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Addition");
        System.out.println("2.Substractiom");
        System.out.println("3. Exit");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Addition Selected");
            break;

            case 2:
                System.out.println("Subtraction Selected");
            break;

            case 3:
                System.out.println("Application Ended");
            break;
            
            default:
            System.out.println("Invalid Choice! Please enter 1,2 or 3.");
        }
        sc.close();
    }
}