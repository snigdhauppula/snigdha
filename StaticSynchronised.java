class Car
{
	public static synchronized void message(String companyName)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("welcome to the car company:");
			try
			{
				Thread.sleep(1000);
				System.out.println(companyName);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class MyThread2 extends Thread
{
	String CompanyName;
	MyThread2(String CompanyName){
		this.CompanyName=CompanyName;
	}
	public void run()
	{
		Car.message(CompanyName);;
	}
}

public class StaticSynchronised {
	public static void main(String args[])
	{
		Trainees batch10=new Trainees();
		MyThread2 x=new MyThread2("swift");
		MyThread2 y=new MyThread2("baleno");
		x.start();
		y.start();
	}

}