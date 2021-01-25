package DailyCoding.Object;

public class ToString {
    public static void main(String args[]){
        ToString obj = new ToString();
        obj.toStringMethod(obj);
        System.out.println();
        obj.toThisString();
    }


    public void toStringMethod(Object obj){
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus "+obj);
    }

    public void toThisString(){
        System.out.println(this);
        System.out.println(this.toString());
        System.out.println("plus "+this);
    }

    @Override
    public String toString() {
        return "ToString{}";
    }
}
