import Marvellous.Arithematic;
import Infosystem.Mathematics;

class PPA
{
    public static void main(String A[])
    {
        Arithematic aobj = new Arithematic();
        Mathematics mobj = new Mathematics();

        System.out.println(aobj.Addition(11,10));
        System.out.println(aobj.substraction(11,10));

        System.out.println(mobj.multiplication(11,10));
        System.out.println(mobj.Division(110,11));
    }
}