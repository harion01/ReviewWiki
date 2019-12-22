package Thread;

public class threadTestRunner {
    public static void main(String args[]){
        System.out.println("Run main thread.");

        threadTestRunner.isThreadGroupSetAutomatically();

        System.out.println("job done.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void isThreadGroupSetAutomatically(){
        ThreadGroup tg = new ThreadGroup("SubGroup");
        makingSubThreadWorker mk = new makingSubThreadWorker();
        Thread runner = new Thread(tg, mk, "Maker");
        runner.start();

    }


    public static void interruptSleepingWorker(){
        getInterruptWaitForGroupWork checker = new getInterruptWaitForGroupWork();
        ThreadGroup tg = new ThreadGroup("checkerGroup");
        Thread runner = new Thread(tg, checker, "checker");
        runner.start();

        for(int i = 0 ; i < 1 ; i++){
            System.out.println("main thread slepping... ["+i+"]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        runner.interrupt();
    }

    public static void interruptJoinWait()  {
        joinWaitBusyWorker jWBW = new joinWaitBusyWorker();
        Thread runner = new Thread(jWBW, "joinWaitBusyWorker");
        runner.start();

        for(int i = 0 ; i < 3 ; i++){
            System.out.println("main thread slepping... ["+i+"]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        runner.interrupt();
    }

    public static void interruptWaitingThread(){
        waitingWorker waitWK = new waitingWorker();
        Thread runner = new Thread(waitWK);
        runner.start();
        runner.interrupt();
    }

    public static void interruptWorkingThread(){
        busyWorker bWK = new busyWorker();
        Thread runner = new Thread(bWK);
        runner.start();
        runner.interrupt();
    }

    public static void extendVsimpelments(){
        extendThreadSample ext = new extendThreadSample();
        ext.start();

        implementRunnableSample imp = new implementRunnableSample();
        Thread t1 = new Thread(imp);
        t1.start();
    }
}
