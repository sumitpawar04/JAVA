import java.util.Scanner;

class Rectangule
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :\n");
        int length = sc.nextInt();

        System.out.println("Enter Breadth :\n");
        int breadth = sc.nextInt();

        int area = length * breadth;                //  10 * 10 = 100
        int perimeter = 2*(length + breadth);       //  2  * (10 + 10) = 40

        System.out.println("Area ="+area);            
        System.out.println("Perimeter ="+perimeter);

        sc.close();
    }
}