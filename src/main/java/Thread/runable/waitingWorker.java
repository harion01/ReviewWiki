package Thread.runable;

public class waitingWorker implements Runnable {
    public void run() {
        Object lock = new Object();

        synchronized (lock) {
            try {
                System.out.println("thread ["+ Thread.currentThread ().getName()+"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] status will be waiting...");
                lock.wait();
            } catch (InterruptedException e) {
                System.out.println("thread ["+ Thread.currentThread ().getName()+"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] receive interrupt");
            }
        }
    }
}
