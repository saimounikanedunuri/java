class Main
{
    public static void main (String[] args) {
        Abc obj=new Abc(1,2.2);
    }
}
class Abc
{
    public Abc()
    {
        System.out.println("parameter...");
    }
    public Abc(int i)
    {
        System.out.println("int.. single parameter");
    }
    public Abc(int i,double d)
    {
        System.out.println("double parameter....");
    }
}
/* 
output
double parameter....
*/
