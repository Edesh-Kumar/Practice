package multiThreading;

public class MultiThreadingProg1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
            System.out.println(currentThread().getId() + " is running");

        }

    }

    public static void main(String[] args) {
        MultiThreadingProg1 t1 = new MultiThreadingProg1();
        MultiThreadingProg1 t2 = new MultiThreadingProg1();
        t1.start();
        t2.start();
    }
}
