package DailyTheory;

public class Constructors {
    public String defStr ;
    public int defInt;
    public boolean defBool;

    // return type이 없이 클래스명과 동일하게 작성할 경우 constructor로 인식함
    public Constructors(){
        System.out.println("void constructor");
    }

    public Constructors(String args){
        System.out.println("String constructor ");
    }

    public Constructors(String str, int in){
        this.defStr = str;
        this.defInt = in;
    }

    public static void main(String args[]){
        //생성자에 초기 변수를 할당 할 수 있도록 여러개의 생성자 작성 가능
        Constructors con = new Constructors();
        Constructors con2 = new Constructors("test");
        Constructors con3 = new Constructors("test",1);
    }
}
