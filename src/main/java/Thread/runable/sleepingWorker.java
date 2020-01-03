package Thread.runable;

public class sleepingWorker implements Runnable{
    public void setSleepLimit(int sleepLimit) {
        this.sleepLimit = sleepLimit;
    }

    private int sleepLimit = 0;

    public void run() {
        for(int i = 0 ; i<sleepLimit ; i++){
            System.out.println("thread ["+ Thread.currentThread ().getName()+"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] sleeping... ["+i+"]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
