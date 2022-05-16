package org.example;


import org.example.threads.MyRunnable;
import org.example.threads.Scorpion;
import org.example.threads.SubZero;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 9A

        System.out.println("*********************Task 9A*********************\n");
        Thread firstThread = new Thread(new MyRunnable("\u001B[31m"));
        Thread secondThread = new Thread(new MyRunnable("\u001B[32m"));
        firstThread.start();
        secondThread.start();


        //9B

        System.out.println("\n*********************Task 9A*********************");
        Thread scorpionThread = new Thread(new Scorpion("\u001B[31m"));
        Thread subZeroThread = new Thread(new SubZero("\u001B[32m"));
        scorpionThread.start();
        subZeroThread.start();


    }
}
