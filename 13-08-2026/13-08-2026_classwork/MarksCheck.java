class MarksException extends Exception
{
    MarksException(String message)
    {
        super(message);
    }
}

public class MarksCheck
{
    public static void checkMarks(int marks) throws MarksException
    {
        if(marks < 0 || marks > 100)
        {
            throw new MarksException("Marks must be between 0 and 100");
        }

        System.out.println("Valid marks.");
    }

    public static void main(String[] args)
    {
        int marks = 120;

        try
        {
            checkMarks(marks);
        }
        catch(MarksException e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}