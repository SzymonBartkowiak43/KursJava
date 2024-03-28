package Zajecia2.Threds;
// 1 approach
//step 1 create class
public class Main {

    public static void main(String[] args) {
//        //step 2 create Object

        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.setName("Janek");
        Thread t2 = new Thread(myRunnable);
        t2.setName("Dominik");
        Thread t3 = new Thread(myRunnable);
        t3.setName("Mateusz");


        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();



    }
}
