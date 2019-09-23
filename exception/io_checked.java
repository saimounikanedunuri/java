import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Demo
{
    public static void main(String args[])
    {
        int i,j=1,k=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        i=8;
        try
        {
            j=Integer.parseInt(br.readLine());
            k=i/j;
        }
        catch(IOException e)
        {
         System.out.println("Some IO Error"+e);   
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
//Some IO Error IOException
