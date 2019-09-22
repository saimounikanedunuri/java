public class local
{
    public void data()
    {
        int i=1;
        System.out.println("local variable: "+ i);
    }
    public static void main(String args[])
    {
        local l=new local();
        l.data();
        System.out.println("hello there!!!!");
    }
}
/* output:
local variable: 1
hello there!!!!
*/
