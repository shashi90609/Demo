package Arrays;
class Ab{
	int age;
 String addr;
	void a(int times)
	{
		System.out.println("eats"+ times+ "in a day");
		System.out.println(age);
	}
	void b(int hrs)
	{
		System.out.println("Sleeps"+hrs+"in a day");
	}
}
public class Simple 
{

	public static void main(String[] args) {
		
Ab obj=new Ab();
obj.age=55;
obj.addr="mkp";
obj.a(3);
obj.b(5);

	}

}
