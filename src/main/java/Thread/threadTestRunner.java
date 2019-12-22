package Thread;

public class threadTestRunner {
    public static void main(String args[]){
        System.out.println("Run main thread.");
        extendThreadSample ext = new extendThreadSample();
        ext.start();

        implementRunnableSample imp = new implementRunnableSample();
        Thread t1 = new Thread(imp);
        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
