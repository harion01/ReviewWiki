package DailyCoding;

public class StaticMethod {
    static String name;
    public StaticMethod(){};
    public StaticMethod(String name){
        this.name = name;
    };

    public static void main(String args[]){
        StaticMethod stat = new StaticMethod();
        stat.checkName();
    }

    public void checkName(){
        StaticMethod stat1 = new StaticMethod("static first");
        System.out.println(stat1.name);
        //static 변수에 값을 할당
        StaticMethod stat2 = new StaticMethod("static second");
        //변수가 static (class 변수)이므로, 한 객체가 값을 변경하면 해당 값을 참조하는 모든 객체에서 변경 된 값을 사용하게된다.
        System.out.println(stat1.name);

    }
}

