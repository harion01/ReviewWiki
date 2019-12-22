package Thread;

public class makingSubThreadWorker implements Runnable {
    public void run() {
        System.out.println("thread ["+ Thread.currentThread ().getName()+"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] maker will run sleeping thread... ");
        sleepingWorker sw = new sleepingWorker();
        sw.setSleepLimit(3);
        Thread t1 = new Thread(sw, "sleeping 1");
        t1.start();

        sleepingWorker sw2 = new sleepingWorker();
        sw2.setSleepLimit(3);
        Thread t2 = new Thread(sw2, "sleeping 2");
        t2.start();


        System.out.println("thread ["+ Thread.currentThread ().getName()+"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] maker job done ");
    }
}
