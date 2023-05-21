package org.example;

public class LocalTest implements Runnable {
    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override
    public void run() {
        threadLocal.set((int) (Math.random() * 100));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.println(threadLocal.get());
    }
}
