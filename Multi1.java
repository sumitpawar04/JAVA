class Multi1
{
    public static void main(String arg[])
    {
        String name = Therad.currentThread().getName();

        System.out.println("Name of thread is : "+name);
    }
}