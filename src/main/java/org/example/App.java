package org.example;


import org.example.threads.Finisher;
import org.example.threads.MyRunnable;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // 9A

//        System.out.println("*********************Task 9A*********************\n");
//        Thread firstThread = new Thread(new MyRunnable("\u001B[31m"));
//        Thread secondThread = new Thread(new MyRunnable("\u001B[32m"));
//        firstThread.start();
//        secondThread.start();


        //9B

//        System.out.println("\n*********************Task 9A*********************");
//        Thread scorpionThread = new Thread(new Scorpion("\u001B[31m"));
//        Thread subZeroThread = new Thread(new SubZero("\u001B[32m"));
//        scorpionThread.start();
//        subZeroThread.start();

        //9C



        MyRunnable scorpionFinisher = new MyRunnable("\u001B[31m") {

            @Override
            public void run() {

                finisher = new Finisher() {
                    @Override
                    public void finishHim() {

                        System.out.println("Scorpion Attacks SubZero with Chain Reaction");


                    }


                };

                finisher.finishHim();

            }
        };

        MyRunnable subZeroFinisher = new MyRunnable("\u001B[32m") {
            @Override
            public void run() {
                finisher = new Finisher() {
                    @Override
                    public void finishHim() {
                        System.out.println("SubZero attacks Scorpion with Ice-Cutione");
                    }


                };
                finisher.finishHim();

            }
        };

        Thread scorpionThread = new Thread(scorpionFinisher);
        Thread subZeroThread = new Thread(subZeroFinisher);
        scorpionThread.start();
        subZeroThread.start();




        // Task 9D

        //First way
        Runnable scorpionAnonymous = () -> {
            Finisher finisher = () -> System.out.println("Scorpion Attacks SubZero with Chain Reaction");
            finisher.finishHim();

        };


        Runnable subZeroAnonymous = () -> {
            Finisher finisher = () -> System.out.println("SubZero attacks Scorpion with Ice-Cutione");
            finisher.finishHim();

        };




        Thread thread = new Thread(scorpionAnonymous);
        Thread thread1 = new Thread(subZeroAnonymous);
        thread.start();
        thread1.start();

        //Second way


        Finisher scorpionFinisherLambda = () -> System.out.println("Scorpion Attacks SubZero with Chain Reaction");

        Finisher subZeroFinisherLambda = () -> System.out.println("SubZero attacks Scorpion with Ice-Cutione");

        MyRunnable scorpionFinisherRunnable = new MyRunnable("\u001B[31m"){
            @Override
            public void run() {
                scorpionFinisherLambda.finishHim();
            }
        };

        MyRunnable subZeroFinisherRunnable = new MyRunnable("\u001B[32m"){
            @Override
            public void run() {
                subZeroFinisherLambda.finishHim();
            }
        };




        Thread threadScorpionLambda = new Thread(scorpionFinisherRunnable);
        Thread threadSubZeroLambda = new Thread(subZeroFinisherRunnable);
        threadScorpionLambda.start();
        threadSubZeroLambda.start();




    }
}

