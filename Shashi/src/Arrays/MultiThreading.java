package Arrays;

class A extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread
{
	public void run1()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(500);} catch (Exception e){}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) 
	{
		A obj=new A();
		B objj=new B();
		obj.start();
		try{Thread.sleep(10);} catch(Exception e){}
		objj.start();
		
		
		
	}

}
