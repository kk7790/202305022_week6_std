package org.example;

public class Subvalue implements Runnable {
    CountCheck counter = new CountCheck();

    @Override
    public void run() {
        counter.minusValue(2);
    }
}
