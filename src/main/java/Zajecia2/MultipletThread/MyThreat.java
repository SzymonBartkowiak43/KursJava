package Zajecia2.MultipletThread;

public class MyThreat implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
