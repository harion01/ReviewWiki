package DailyTheory.interfaceService;

import DailyTheory.Object.MemberDTO;

public class MemberManagerAbstractImpl extends MemberManagerAbstract{
    //abstract class를 상속받았으므로, 부모 클래스의 abstract 메소드를 모두 구현해야한다.
    @Override
    public boolean addMember(MemberDTO member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return false;
    }
}
