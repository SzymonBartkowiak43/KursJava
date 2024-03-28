package Zajecia2.CodeSynchronization;

public class Main implements Runnable{
    Account acct = new Account();

    @Override
    public void run() {
        for(int i = 0;i < 5; i++) {
            makeWithdrawal(10);
        }
    }


    private synchronized void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName()
                    + " is going to withdraw");

            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName()
                    + " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for "
                    + Thread.currentThread().getName()
                    + " to withdraw " + acct.getBalance());
        }
    }

    public static void main(String[] args) {
        Main x = new Main();

        Thread marek = new Thread(x);
        Thread basia= new Thread(x);

        marek.setName("Marek");
        basia.setName("Basia");

        marek.start();
        basia.start();
    }
}
