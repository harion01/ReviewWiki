package Thread.runable;

public class joinWaitBusyWorker implements Runnable {
    boolean isActiveBusy = false;

    public void setActiveBusy(boolean activeBusy) {
        isActiveBusy = activeBusy;
    }

    public void setActiveSleep(boolean activeSleep) {
        isActiveSleep = activeSleep;
    }

    boolean isActiveSleep = false;

    public void run() {

        System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] work start");
        busyWorker bWK = new busyWorker();
        Thread workingThread = new Thread(bWK, "busyWorker");
        System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] let busy worker start");
        workingThread.start();


        try {
            System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] join start");
            workingThread.join();
            System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] join end");
        } catch (InterruptedException e) {
            System.out.println("Thread [" + Thread.currentThread().getName() + "] group [" + Thread.currentThread().getThreadGroup().getName() + "] receive interrupt");
        }

    }

}
