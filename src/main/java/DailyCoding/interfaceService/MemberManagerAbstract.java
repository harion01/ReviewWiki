package DailyCoding.interfaceService;

import DailyCoding.Object.MemberDTO;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);

    //기본으로 사용하는 메소드를 미리 구현해둘수있다.
    public void printLog(String data){
        System.out.println("Data"+data);
    }
}
