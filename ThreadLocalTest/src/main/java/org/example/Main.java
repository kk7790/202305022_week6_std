package org.example;

public class Main {
    public static void main(String[] args) {
        LocalTest test = new LocalTest();
        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(test);
        System.out.print("thread 1: ");
        thread1.start();

        System.out.println("thread 2: ");
        thread2.start();


    }
}