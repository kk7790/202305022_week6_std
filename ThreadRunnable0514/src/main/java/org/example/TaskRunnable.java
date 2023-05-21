package org.example;

public class TaskRunnable implements Runnable {
    CountCheck counter = new CountCheck();

    @Override
    public void run() {
        counter.addValue(3);
    }
}
