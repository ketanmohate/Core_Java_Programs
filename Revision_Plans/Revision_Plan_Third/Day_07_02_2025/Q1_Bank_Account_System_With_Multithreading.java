package Day_07_02_2025;

/*
 Question1: 
Bank Account System with Multithreading
Scenario Overview: We have a bank account class where multiple threads are trying to access and modify the balance by performing deposit and  withdrawal operations. We need to ensure thread safety when these operations are happening concurrently.

Program Steps:
Create a BankAccount Class: 
This class will have methods for deposit and withdrawal. We'll make these methods synchronized to avoid race conditions.
Create a Task Class: 
  This class will represent the deposit/withdrawal operation. It will implement the Runnable interface.

Run the Application: 
         We'll create multiple threads to simulate concurrent deposits and withdrawals on the same bank account.


Explanation:
BankAccount Class:
This class maintains a balance and provides synchronized methods of deposit and withdrawal to ensure that only one thread can modify the balance at a time, preventing race conditions.
The getBalance method is synchronized as well to ensure that the balance is accessed in a thread-safe manner.
BankTask Class:
This class implements the Runnable interface and represents a task that can either deposit or withdraw money from the bank account.
The constructor takes in the bank account a flag indicating whether it's a deposit or withdrawal, and the amount to be deposited or withdrawn.
BankSimulation Class (Main):
In this class, we create a BankAccount with an initial balance of 1000.
We then create and start multiple threads that will perform deposit or withdrawal operations concurrently.
We use join to make sure the main thread waits for all other threads to finish before printing the final balance.


Key Concepts you have to use in above application
Synchronization: The deposit and withdrawal methods are synchronized to ensure that only one thread can access these methods at any time. This prevents issues like inconsistent or incorrect balances.
Multithreading: The example demonstrates how to create multiple threads that perform concurrent operations on the same resource (bank account).
Thread Safety: The program ensures that even though multiple threads are accessing and modifying the bank account, the balance remains consistent and free of race conditions.
 */

import java.util.*;

class BankAccount 
{
    private int balance;

    public BankAccount(int balance) 
    {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) 
    {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdraw(int amount) 
    {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", New Balance: " + balance);
        } 
        else 
        {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient balance!");
        }
    }

    public synchronized int getBalance() 
    {
        return balance;
    }
}

class BankTask implements Runnable 
{
    private BankAccount account;
    private boolean isDeposit;
    private int amount;

    public BankTask(BankAccount account, boolean isDeposit, int amount) 
    {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() 
    {
        if (isDeposit) 
        {
            account.deposit(amount);
        } 
        else 
        {
            account.withdraw(amount);
        }
    }
}

public class Q1_Bank_Account_System_With_Multithreading 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();

        BankAccount account = new BankAccount(initialBalance);

        System.out.print("Enter number of transactions: ");
        int numTransactions = scanner.nextInt();
        
        Thread[] threads = new Thread[numTransactions];

        for (int i = 0; i < numTransactions; i++) 
        {
            System.out.print("Enter transaction type (deposit/withdraw): ");
            String type = scanner.next();
            
            System.out.print("Enter amount: ");
            int amount = scanner.nextInt();
            
            boolean isDeposit = type.toLowerCase().equals("deposit");
            
            threads[i] = new Thread(new BankTask(account, isDeposit, amount), "Thread-" + (i + 1));
            threads[i].start();
        }

        for (Thread thread : threads) 
        {
            try 
            {
                thread.join();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }

        System.out.println("Final Balance: " + account.getBalance());
        scanner.close();
    }
}
