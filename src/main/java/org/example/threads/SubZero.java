package org.example.threads;

public class SubZero extends MyRunnable {

    private Scorpion scorpion;

    public SubZero(String ANSI_RED) {
        super(ANSI_RED);

    }


    public void finishHim() {

        System.out.println("\u001B[32m" + "SubZero killed Scorpion with chain reaction, SubZero won!!");

    }

    @Override
    public void run() {
        super.run();

        finishHim();
    }

}
