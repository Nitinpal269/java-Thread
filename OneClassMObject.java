class Thread1 extends Thread
{
Thread1(String s)
{
super(s);
}
public void run()
{
for(int i=1; i<=5; i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println(getName() +" dead");
}
}

class OneClassMObject
{
public static void main(String[] args)
{
Thread1 t1=new Thread1("thread1");
Thread1 t2=new Thread1("thread2");
Thread1 t3=new Thread1("thread3");
t1.start();
t2.start();
t3.start();
for(int i=1; i<=5; i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println(Thread.currentThread().getName() +" dead");
}
}
