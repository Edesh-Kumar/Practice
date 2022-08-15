package multiThreading;

public class Prog2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i + " from thread " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Prog2 p1 = new Prog2();
            Thread t1 = new Thread(p1);
            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }


        }
    }
}
