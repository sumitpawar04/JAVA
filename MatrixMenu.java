import java.util.Scanner;

class MatrixMenu
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][2];
        int brr[][] = new int[2][2];
        int crr[][] = new int[2][2];

        System.out.println("Enter first Matrix:");

        for(int i = 0; i < 2; i++)
        {
        for(int j = 0; j < 2; j++)
            {
            arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second Matrix:");

        for(int i = 0; i < 2; i++)
        {
        for(int j = 0; j < 2; j++)
            {
                brr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n1.Addition");
        System.out.println("2.Multiplication");
        System.out.println("3.Transpose");
        System.out.println("4.Exit");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Addition:");
                for(int i = 0; i < 2; i++)
                {
                    for(int j = 0; j < 2; j++)
                    {
                        crr[i][j] = arr[i][j] + brr[i][j];
                        System.out.print(crr[i][j]+"");
                    }
                    System.out.println();
                }
            break;

            case 2:
                System.out.println("Multiplication:");
                for(int i = 0; i < 2; i++)
                {
                    for(int j = 0; j < 2; j++)
                    {
                        crr[i][j] = 0;
                        for(int k = 0; k < 2; k++)
                        {
                            crr[i][j] = crr[i][j] + arr[i][k] * brr[k][j]; 
                        }
                        System.out.println(crr[i][j]+"");
                    }
                    System.out.println();
                }
             break;

             case 3:
                System.out.println("Transpose of First Matrix:");
                for(int i = 0; i < 2; i++)
                {
                    for(int j = 0; j < 2; j++)
                    {
                        System.out.println(arr[j][i]+"");
                    }
                    System.out.println();
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