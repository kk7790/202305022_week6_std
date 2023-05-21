package org.example;

public class Main {
    public static void main(String[] args) {
        TaskRunnable taskR = new TaskRunnable();

        Thread th1 = new Thread(taskR);
        Thread th11 = new Thread(taskR);

        th1.start();
        th11.start();
    }
}