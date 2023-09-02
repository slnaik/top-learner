package multiday6.tap.synch;

class Queue
{
	int x;
	void stroe(int j)
	{
		x=j;
		System.out.println("produced "+x); 
	}
	void retrive()
	{
		System.out.println("consumed "+x);
	}
}

class producer extends Thread
{
	Queue a;
	public producer(Queue q)
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
	Queue b;
	public consumer(Queue q)
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

public class Day41 {

	public static void main(String[] args) 
	{
		Queue q = new Queue();
		producer p = new producer(q);
		consumer c = new consumer(q);
		p.start();
		c.start();
		

	}

}
