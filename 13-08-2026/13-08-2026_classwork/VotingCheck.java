class AgeException extends Exception
{
    AgeException(String message)
    {
        super(message);
    }
}

public class VotingCheck
{
    public static void checkAge(int age) throws AgeException
    {
        if(age < 18)
        {
            throw new AgeException("Age must be 18 or above");
        }

        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args)
    {
        int age = 15;

        try
        {
            checkAge(age);
        }
        catch(AgeException e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}

