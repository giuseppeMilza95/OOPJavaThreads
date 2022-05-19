package org.example.threads;

import java.util.List;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Double> {

    private Finisher finisher;
    @Override
    public Double call() throws Exception {
        for (int i = 2; i >= 0; i--){

            System.out.println(Thread.currentThread() + " " + i + " seconds");
            Thread.sleep(1000);
        }
        return Math.random();

    }


    public Finisher getFinisher() {
        return finisher;
    }

    public void setFinisher(Finisher finisher) {
        this.finisher = finisher;
    }
}
