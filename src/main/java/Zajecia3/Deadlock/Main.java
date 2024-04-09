package Zajecia3.Deadlock;

public class Main {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void read() {
        try {
            synchronized (lock1) {
                Thread.sleep(1000);
                synchronized (lock2) {
                    System.out.println("read");
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write() {
        try {
            synchronized (lock2) {
                Thread.sleep(1000);
                synchronized (lock1) {
                    System.out.println("write");
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(Main::read);
        Thread t2 = new Thread(Main::write);

        t1.setName("Marek");
        t2.setName("Basia");

        t1.start();
        t2.start();
    }
}
