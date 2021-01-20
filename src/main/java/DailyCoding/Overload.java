package DailyCoding;

public class Overload {
    public String str;
    public int in;
    public boolean bool;

    //동일한 이름의 method 이지만, 넘겨주는 argument가 다르기 때문에 method overlaoding에 의해 다르게 동작한다.
    public void setData(int data){
        this.in = data;
    }

    public void setData(String data){
        this.str = data;
    }

    public void setData(boolean data) {
        this.bool = data;
    }

    public void printData(){
        System.out.println("Data print str :"+this.str);
        System.out.println("Data print int :"+this.in);
        System.out.println("Data print bool :"+this.bool);
    }

    public static void main(String args[]){
        Overload ov1 = new Overload();
        ov1.setData("test");
        ov1.printData();

        Overload ov2 = new Overload();
        ov2.setData(10);
        ov2.printData();

        Overload ov3 = new Overload();
        ov3.setData(true);
        ov3.printData();

    }

}
