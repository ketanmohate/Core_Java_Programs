package Day_06_02_2025;

class MyThread extends Thread 
{
    public void run() 
    {
        try 
        {
            for (int i = 1; i <= 5; i++) 
            {
                System.out.println(Thread.currentThread().getName() + " -> Count: " + i);
                Thread.sleep(1000);  // Sleep for 1 second
            }
        } 
        catch (InterruptedException e) 
        {
            System.ou	t.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class Q2_Threading 
{
    public static void main(String[] args) 
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        // Checking if threads are alive
        System.out.println("Is t1 alive? " + t1.isAlive());
        System.out.println("Is t2 alive? " + t2.isAlive());

        try 
        {
            // Wait for t1 to complete
            t1.join();
            System.out.println("t1 has finished execution.");

            // Wait for t2 to complete
            t2.join();
            System.out.println("t2 has finished execution.");
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Is t1 alive after join? " + t1.isAlive());
        System.out.println("Is t2 alive after join? " + t2.isAlive());

        // **Unsafe Stop Usage (Deprecated)**
        // t1.stop(); // Not recommended
        // t2.stop(); // Not recommended

        System.out.println("Main thread execution completed.");
    }
}

