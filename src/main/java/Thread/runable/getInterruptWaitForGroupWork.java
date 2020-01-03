package Thread.runable;

public class getInterruptWaitForGroupWork implements Runnable {
    public void run() {

        ThreadGroup tg = new ThreadGroup("subGroup");
        System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] work start");

        sleepingWorker sWK_1 = new sleepingWorker();
        sWK_1.setSleepLimit(1);
        Thread workingThread = new Thread(tg, sWK_1, "sleepingWorker_1");
        workingThread.start();

        sleepingWorker sWK_2 = new sleepingWorker();
        sWK_2.setSleepLimit(2);
        Thread workingThread2 = new Thread(tg, sWK_2, "sleepingWorker_2");
        workingThread2.start();

        sleepingWorker sWK_3 = new sleepingWorker();
        sWK_3.setSleepLimit(3);
        Thread workingThread3 = new Thread(tg, sWK_3, "sleepingWorker_3");
        workingThread3.start();



        try {
            System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] join start");
            workingThread3.join();
            System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] join end");
        } catch (InterruptedException e) {
            System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] receive interrupt");
            int activeCount = tg.activeCount();
            while(activeCount != 0){
                activeCount = tg.activeCount();
                try {
                    System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] wait for sub group active  done... active count ["+activeCount+"]");
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
            System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] status check finished");

        }

    }
}
