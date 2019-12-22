package Thread;

public class implementRunnableSample extends basic implements Runnable{


    public void run() {
        super.testPrint();
        System.out.println("Implements Runnable. Run method executed by child Thread");
    }
}
