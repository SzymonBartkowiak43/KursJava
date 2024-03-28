package Zajecia2.Threds;

import static java.lang.Thread.sleep;

public class MyRunnable implements  Runnable{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i = 0; i < 5;i ++) {
            System.out.println(name);
        }
    }
}
