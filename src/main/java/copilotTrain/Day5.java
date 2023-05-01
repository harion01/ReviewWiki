package copilotTrain;

public class Day5 {
    public static void main(String[] args) {
        int i = 1;
        loopPrint(i);
    }


    //get intget from argument
    //loop 10 times. print arument * loop count
    public static void loopPrint(int i){
        for(int j = 1; j <= 10; j++) {
            System.out.println(i + " x " + j + " = " + i*j);
        }
    }
}
