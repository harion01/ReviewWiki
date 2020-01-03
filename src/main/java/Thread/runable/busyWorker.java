package Thread.runable;

import java.util.Random;

public class busyWorker implements Runnable {




    public void run() {
        Random rng = new Random();
        long calculationsPerformed = 0;
        boolean stopped = false;
        double store = 0;


        try{
            System.out.println("Thread ["+ Thread.currentThread().getName() +"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] work start");

            while (! stopped)
            {
                double r = rng.nextFloat();
                double v = Math.sin(Math.cos(Math.sin(Math.cos(r))));
                store *= v;
                calculationsPerformed++;
            }

            System.out.println("Thread ["+ Thread.currentThread().getName() +"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] work end");
            System.out.println("Thread ["+ Thread.currentThread().getName() +"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] sleep start");
            Thread.sleep(1000);
            System.out.println("Thread ["+ Thread.currentThread().getName() +"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] sleep end");
        }catch (InterruptedException inter){
            System.out.println("Thread ["+ Thread.currentThread().getName() +"] group ["+ Thread.currentThread ().getThreadGroup().getName()+"] receive interrupt" );
        }

    }



}
