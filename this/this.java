public class Main 
{
    public static void main (String[] args) {
        A obj=new A(5);
        obj.show();
    }
}
class A
{
    private int x;//instance
    public A(int x)//local 
    {
        this.x=x;//current instance
    }
    public void show()
    {
        System.out.println("x is "+x);
    }
}
//x is 5
