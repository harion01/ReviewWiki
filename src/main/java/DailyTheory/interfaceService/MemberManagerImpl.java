package DailyTheory.interfaceService;

import DailyTheory.Object.MemberDTO;

public class MemberManagerImpl implements MemberManager{
    //interface를 구현 했으므로, 해당 interface에 선언된 method를 모두 구현해야된다.
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
