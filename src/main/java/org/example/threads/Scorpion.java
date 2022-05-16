package org.example.threads;


public class Scorpion extends MyRunnable {
    public  static  boolean attackFirstScorpion;

    private SubZero subZero;


    public Scorpion(String ANSI_RED) {
        super(ANSI_RED);
        this.attackFirstScorpion = false;
    }


    public void finishHim() {
        System.out.println("\u001B[31m" + "Scorpion killed SubZero with chain reaction, Scorpion won!!");
    }

    @Override
    public void run() {
        super.run();
        finishHim();


    }


    public static boolean isAttackFirstScorpion() {
        return attackFirstScorpion;
    }

    public static void setAttackFirstScorpion(boolean attackFirstScorpion) {
        Scorpion.attackFirstScorpion = attackFirstScorpion;
    }

    public SubZero getSubZero() {
        return subZero;
    }

    public void setSubZero(SubZero subZero) {
        this.subZero = subZero;
    }
}
