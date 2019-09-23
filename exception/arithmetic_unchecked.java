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
        System.out.println(k);
    }
}
/*
output:
Can't divide by Zero java.lang.ArithmeticException: / by zero
0
*/
