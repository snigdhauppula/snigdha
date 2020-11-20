class Customer
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw");
		if(this.amount<amount)
		{
			System.out.println("less balance go and deposit");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			
		}
	this.amount-=amount;
	System.out.println("withdraw completed");
	}
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println("deposit done");
		notify();
		}
		}
	

public class CustomerMain {
public static void main(String args[])
{
	Customer cu=new Customer();
	new Thread()
	{
		public void run()
		{
			cu.withdraw(15000);
		}
	}
	.start();
	new Thread()
	{
		public void run()
		{
			cu.deposit(20000);
		}
	}.start();
}
}
	
