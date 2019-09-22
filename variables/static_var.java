public class Static
{
   
    static int j=1;
    public void data()
    {
        int i=2;
        System.out.println("local var value: "+i);
    }
    public static void main(String args[])
    {
        Static s=new Static();
        s.data();
        System.out.println("static var value: "+j);
    }
}
/*output:
local var value: 2
static var value: 1
*/
