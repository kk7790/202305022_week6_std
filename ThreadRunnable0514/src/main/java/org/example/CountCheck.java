package org.example;

public class CountCheck {
    int counter = 100; //공유할자원

    public synchronized int addValue(int addValue) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread thread = Thread.currentThread();
                counter += addValue;
                System.out.println(thread.getName() + "더하기" + counter);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.print(e);
            }
        }
        return counter;
    }

    public int minusValue(int minus) {
        for (int i = 0; i < 10; i++) {

            try {
                Thread thread = Thread.currentThread();
                Thread.sleep(500);
                counter -= minus;
                System.out.println(thread.getName() + "빼기" + counter);
            } catch (Exception e) {
                System.out.print(e);
            }
        }
        return counter;
    }
}
