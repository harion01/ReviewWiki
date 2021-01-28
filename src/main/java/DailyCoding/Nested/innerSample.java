package DailyCoding.Nested;

public class innerSample {
    public static void main(String args[]){
        innerSample sample = new innerSample();
        sample.makeInnerObject();
    }

    public void makeInnerObject(){
        OuterOfInner outer = new OuterOfInner();
        //outer 객체를 통해서만 inner class를 생성 할 수 있다.
        //내부 동작이 제각각이면서 class로 묶어야 할 떄 사용. GUI 버튼 리스너 등
        OuterOfInner.Inner inner = outer.new Inner();
        inner.setValue(10);
        System.out.println(inner.getValue());
    }

}
