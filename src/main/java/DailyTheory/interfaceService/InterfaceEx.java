package DailyTheory.interfaceService;

public class InterfaceEx {
    public static void main(String args[]){
        //형변환으로 interface의 참조변수 실제 구햔된 class의 객체를 할당한다.
        //특정 interface를 구현한 class를 모두 수용 가능하다.
        MemberManager mem = new MemberManagerImpl();
    }
}
