public class Demo
{
    public static void main(String args[])
    {
        int i=8,j=2,k=0;
        int a[]=new int[4];
        try
        {               
            k=i/j;
            for(int c=0;c<=4;c++)
        {
            a[c]=c+1;
        }
        for(int value:a)
        {
            System.out.println(value);
        }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by Zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Max no. of value is 4"+e);
        }
        System.out.println(k);
    }
}
/*
output:
Max no. of value is 4java.lang.ArrayIndexOutOfBoundsException: 4
4
*/
