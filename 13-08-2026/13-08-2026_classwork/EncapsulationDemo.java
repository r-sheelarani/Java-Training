class StudentDetails
{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
}

public class EncapsulationDemo extends StudentDetails
{
    public static void main(String[] args)
    {
        EncapsulationDemo s = new EncapsulationDemo();
        s.setName("Sheela");
        s.setAge(20);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
