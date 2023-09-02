package tap.com.in;

class Queuee
{
	int x;
	boolean isDataPresent=false; 
	synchronized void stroe(int j)
	{
		try {
			if(isDataPresent==false)
			{
			x=j;
			System.out.println("produced "+x); 
			isDataPresent=true;
			notify();
			}
			else
			{
				wait();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		}

	synchronized void retrive()
	{
		try {
			if(isDataPresent==true)
			{
				System.out.println("consumed "+x);
				isDataPresent=false;
				notify();
			}
			else
			{
				wait();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
}
}

class producer extends Thread
{
	Queuee a;
	public producer(Queuee q)
	{
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		for(;;)
		{
			a.stroe(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}


class consumer extends Thread
{
	Queuee b;
	public consumer(Queuee q)
	{
		b=q;
	}
	@Override
	public void run() {
		for(;;)
		{
			b.retrive();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Example1{

	public static void main(String[] args) 
	{
		Queuee q = new Queuee();
		producer p = new producer(q);
		consumer c = new consumer(q);
		p.start();
		c.start();
		

	}

}





