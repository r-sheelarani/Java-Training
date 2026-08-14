class AccessDemo
{
    static int x = 10;
    int y = 20;
}

public class TestAccess extends AccessDemo
{
    public static void main(String[] args)
    {
        TestAccess d = new TestAccess();

        System.out.println(x);
        System.out.println(d.y);

        d.x = 100;
        d.y = 200;

        System.out.println(x);
        System.out.println(d.y);
    }
}