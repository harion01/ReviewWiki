package DailyTheory.inheritance;

public class Child extends Parent{
    public Child(){
        //Parent의 기본 생성자가 없기 때문에 명시적으로 호출하지 않을 경우 컴파일 에러가 발생한다.
        //명시적으로 생성자를 호출한다.
        super("test");
    }

    //method overriding - parent class의 동일 메소드를 대체한다.
    public void print(){
        System.out.println("child print()");
    }

    //부모 클래스의 method 접근제어자가 더 작은 범위일 경우에는 확장해서 override가 가능하다. private < protected < public
    public void personalPrint(){
        System.out.println("child personal");
    }

    public void objectCastArray(){
        //부모 class object로 모든 자식 class를 object를 할당 받을 수 있다.
        Parent[] parentArr = new Parent[3];
        parentArr[0] = new Child();
        parentArr[1] = new Parent();
        parentArr[2] = new Child();

        for(Parent po : parentArr){
            this.objectTypeCheck(po);
        }
    }

    public void objectTypeCheck(Parent obj){

        if(obj instanceof Parent){
            //child는 child instance이지만 parent instance이기도 하다. parent로만 체크하면 모두 true
            if(obj instanceof Child){
                System.out.println("this is Child");
            } else {
                System.out.println("this is Parent");
            }
        }else {
            System.out.println("undefined");
        }

    }

    public static void main(String args[]){
        Child c = new Child();
        c.print();
        c.personalPrint();

        //형변환을 통해서 컴파일 오류를 피함
        //Child pc = (Child)new Parent();
        //런타임 오류 발생. parent의 부모 클래스의 객체가 자식클래스에서 오버라이딩 된 메소드를 호출한다.
        //pc.personalPrint();

        //부모 클래스에서 생성한 객체
        Parent p = new Parent();
        //부모 클래스 객체에 자식 클래스 객체 할당
        p = c;
        // 자식 객체 생성 후, 자식 클래스가 할당되어있던 p를 다시 child로 캐스팅해서 할당.
        Child childCasted = (Child)p;
        //할당된 객체의 클래스가 자식클래스이므로, 정상적으로 method 호출 가능.
        childCasted.personalPrint();

        childCasted.objectCastArray();
    }
}
