package Day_06_02_2025;

class SyncExample 
{
    // Synchronized method (Only one thread can access it at a time)
    public synchronized void printNumbers(String name) 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(name + " prints: " + i);
            try 
            {
                Thread.sleep(500); // Simulate a delay
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

// Thread class for Synchronized Execution
class SyncThread extends Thread 
{
    SyncExample syncObj;
    String name;

    public SyncThread(SyncExample syncObj, String name) 
    {
        this.syncObj = syncObj;
        this.name = name;
    }

    public void run() 
    {
        syncObj.printNumbers(name);
    }
}

// Thread class for Asynchronous Execution
class AsyncTask extends Thread 
{
    String taskName;

    public AsyncTask(String taskName) 
    {
        this.taskName = taskName;
    }

    public void run() 
    {
        System.out.println(taskName + " is running asynchronously.");
        try 
        {
            Thread.sleep(1000); // Simulate a delay
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println(taskName + " is completed.");
    }
}

public class Q3_Threading 
{
    public static void main(String[] args) 
    {
        SyncExample syncObj = new SyncExample();

        // Synchronized execution
        System.out.println("Synchronized Execution:");
        SyncThread t1 = new SyncThread(syncObj, "Thread 1");
        SyncThread t2 = new SyncThread(syncObj, "Thread 2");

        t1.start();
        t2.start();

        // Wait for synchronized threads to complete
        try 
        {
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        // Asynchronous execution
        System.out.println("\nAsynchronous Execution:");
        AsyncTask task1 = new AsyncTask("Task A");
        AsyncTask task2 = new AsyncTask("Task B");

        task1.start();
        task2.start();
    }
}
