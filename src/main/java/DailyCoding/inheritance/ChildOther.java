package DailyCoding.inheritance;

public class ChildOther extends Parent{
    public ChildOther(){
        super("test");
    }

    //method overriding - parent class의 동일 메소드를 대체한다.
    public void print(){
        System.out.println("childOther print()");
    }

    //부모 클래스의 method 접근제어자가 더 작은 범위일 경우에는 확장해서 override가 가능하다. private < protected < public
    public void personalPrint(){
        System.out.println("childOther personal");
    }


    public static void main(String args[]){
        Parent par1 = new Parent();
        Parent par2 = new Child();
        Parent par3 = new ChildOther();

        //모두 동일한 Parent class로 선언한 객체여도, 호출되는 메소드는 할당된 실제 객체의 타입이다.
        par1.print();
        par2.print();
        par3.print();
    }
}

