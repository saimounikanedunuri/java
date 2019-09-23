public class Demo
{
    public static void main(String args[])
    {
        int i=2,j=0,k=0;
        try
        {
            k=i/j;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by Zero"+e);
        }
        
        finally
        {
            System.out.println("Finally block...");
        }
    }
}
/*
output:
Can't divide by Zerojava.lang.ArithmeticException: / by zero
Finally block...
*/
