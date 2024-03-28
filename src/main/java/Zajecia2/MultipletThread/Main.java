package Zajecia2.MultipletThread;

public class Main {
    public static void main(String[] args) {
        MyThreat runnable = new MyThreat();

        System.out.println("start");
        Thread t1 = new Thread(runnable);
        t1.setName("Marek");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finish test");

    }
}
