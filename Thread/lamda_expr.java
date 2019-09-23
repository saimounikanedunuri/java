public class ThreadDemo
{
    public static void main(String args[])
    {
        
        Thread t1=new Thread(() -> {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hii");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                
            }
        }});
        Thread t2=new Thread(() -> {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hello");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                
            }
        }});
        t1.start();
        try
        {
            Thread.sleep(10);
        }
        catch(Exception e)
        {
            
        }
        t2.start();
    }
}
/*output:
hii
hello
hii
hello
hii
hello
hii
hello
hii
hello
*/
