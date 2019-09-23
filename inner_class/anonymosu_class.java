class Outer
{
    void show()
    {
        System.out.println("In outer");
    }
}
public class Demo
{
    public static void main(String args[])
    {
        Outer out=new Outer()
        {
            void show()
        {
        System.out.println("In inner");
        }
        };
        out.show();
    }
}
//In inner
/*
normal class:
class Outer
{
    void show()
    {
        System.out.println("In outer");
    }
}
class Inner extends Outer
{
    void show()
    {
        System.out.println("In inner");
    }
}
public class Demo
{
    public static void main(String args[])
    {
        Outer out=new Inner();
        out.show();
    }
}
//output:In inner
*/

