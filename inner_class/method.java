class Outer
{
    void show()
    {
        System.out.println("Outer");
    
    class Inner
    {
        void data()
        {
            System.out.println("Inner");
        }
    }
    Inner in=new Inner();
    in.data();
}
}
public class Method
{
    public static void main(String args[])
    {
        Outer out=new Outer();
        out.show();
    }
}
/*
output:
Outer
Inner
*/
