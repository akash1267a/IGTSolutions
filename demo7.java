class a
{
    int a1 = 100;
    void abc(int a1)
    {
        System.out.println("Hii A class "+ this.a1);
        System.out.println("Hii A class " +a1);


    }
}

class Demo7
{
    public static void main(String args[])
    {
        A a = new A();
        a.abc(1000);
    }
}

---------------------------------------------------------------------------



Class a{
        int a1 = 1000;

}
class B extends A 
{
    int a1 = 100;
    void xyz(int a1)
    {
        System.out.println("B class " +a1)
        System.out.println("B class " +this.a1)
        System.out.println("B class " +super.a1)
    }

}
class Demo7
{
    public static void main(String args[])
    {
        B b = new B();
        b.xyz(1000);
    }
}