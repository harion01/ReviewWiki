package DailyCoding.Nested;

public class nestedSample {
    public static void main(String args[]){
        nestedSample sample = new nestedSample();
        sample.makeNested();

    }

    public void makeNested(){
        OuterOfStatic.StaticNested staticMethod = new OuterOfStatic.StaticNested();
        staticMethod.setValue(3);
        System.out.println(staticMethod.getValue());
    }

}
