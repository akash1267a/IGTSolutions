import java.util.Scanner




Class A
{

	int uid, string name; age; int salary, String desig;
    A()
	{
		scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID?"); 
        int uid = sc.nextInt();

        System.out.print("Enter the name"); 
        string name = sc.next();

        

        System.out.println("Enter the Age"); 
        int age = sc.nextInt();

        System.out.println("Enter the Salery"); 
        int salery = sc.nextInt();

        System.out.print("Enter the Desig"); 
        string Desig = sc.next();
    }

    void display()
    {
        system.out.println("id : " + uid);
        System.out.println("name : " + name);
        system.out.println("age: " + age);
        System.out.println("salery : " + salery);
        System.out.println("Desig : " + Desig);
	}
}





Class Demo4
{

	
    public static void main(String[] args)
	{
		System.out.println("Demo4");
		A a = new A();
		a.display();
	}
}