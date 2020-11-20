public class Priority extends Thread
{
public void run()
{
System.out.println("thread name"+thread.currentThread().getName());
System.out.println("thread priority"+thread.currentThread().getPriority());
}
public static void main(String args[])
{
Priority x=new Priority();

x.setPriority(Thread.MIN_PRIORITY);
Prioity y=new Priority();
Y.set priority(Thread.MAX_PRIORITY);
x.start();
y.start();
}
}
