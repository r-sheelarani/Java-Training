class Demo
{
    private static int x = 10;
    protected static int y = 20;
    static int z = 30;
    public static int a = 40;
}

public class Main extends Demo
{
    public static void main(String[] args)
    {
        // System.out.println("x = " + x);  // private - cannot access
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("a = " + a);
    }
}