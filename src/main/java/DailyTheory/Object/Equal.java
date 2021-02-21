package DailyTheory.Object;

public class Equal {
    public static void main(String args[]){
        Equal eq = new Equal();
        eq.equalMethod();
    }

    public void equalMethod(){
        MemberDTO obj1 = new MemberDTO("JJ", 1436);
        MemberDTO obj2 = new MemberDTO("JJ", 1436);
        if(obj1 == obj2){
            System.out.println("obj1 and obj2 is same");
        }else {
            System.out.println("obj1 and obj2 is different");
        }

        if(obj1.equals(obj2)){
            System.out.println("obj1 and obj2 is equal");
        }else {
            System.out.println("obj1 and obj2 is not equal");
        }
    }
}
