class Trainees
{
	public synchronized void message(String companyName)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("welcome to the company:");
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
class MyThread1 extends Thread
{
	Trainees t;
	String CompanyName;
	MyThread1(Trainees t,String CompanyName){
		this.t=t;
		this.CompanyName=CompanyName;
	}
	public void run()
	{
		t.message(CompanyName);;
	}
}
public class SynchronisationDemo {
	public static void main(String args[])
	{
		Trainees batch10=new Trainees();
		MyThread1 x=new MyThread1(batch10,"motivity");
		MyThread1 y=new MyThread1(batch10,"jnit");
		x.start();
		y.start();
	}

}